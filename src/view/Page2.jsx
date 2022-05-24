import React, { useEffect, useState } from 'react'
import {Button, FormControl} from '@mui/material'
import {getAll, getAllWithParams} from "../service/CourseService";
import {useForm} from "react-hook-form";
import photo from "../assets/Schermata da 2022-05-23 19-07-21.png";
import {useNavigate} from "react-router-dom";




export default function Page2(){

    const[courses, setCourses] = useState([])
    const[isLoaded, setLoaded] = useState(false)
    const history = useNavigate()

    useEffect(()=> {
        getAll()
            .then(resp =>{
                setCourses(resp.data)
            })
    }, [isLoaded])

    const { register, handleSubmit, formState: {errors} } = useForm()

    const doFetch = (data) => {
        getAllWithParams(data).then(resp => {
            setCourses(resp.data)
        })
    }

    return (
        <>
        <div style={{position: "absolute"}}>
            <img src={photo} onClick={() => history("/")}/>
        </div>
        <div style={{position: "absolute", width: "100%", height: "70%", backgroundColor: "white"}}>
            <div style={{width: "100%", height: "8%", borderBottom: "lightgray solid 1px"}}></div>
            <div style={{
                width: "100%",
                height: "8%",
                display: "inline-block",
                alignContent: "center",
                marginBottom: "9px"
            }}>
                <form onSubmit={handleSubmit(doFetch)}>
                    <FormControl style={{display: "inline-block", marginTop: "7px", marginLeft: "15px"}}>
                        <inputLabel error={errors.country ? true : false}>Country</inputLabel>
                        <input
                            {...register("country")}
                            error={errors.country ? true : false}
                            autoFocus={true}
                            type='text'
                        />
                    </FormControl>
                    <FormControl style={{display: "inline-block", marginLeft: '10%', marginTop: "7px"}}>
                        <inputLabel error={errors.price1 ? true : false}>Price from</inputLabel>
                        <input
                            {...register("price1")}
                            error={errors.price1 ? true : false}
                            type='text'
                        />
                    </FormControl>
                    <FormControl style={{display: "inline-block", marginTop: "7px", marginLeft: '3%'}}>
                        <inputLabel error={errors.price2 ? true : false}>Price to</inputLabel>
                        <input
                            {...register("price2")}
                            error={errors.price2 ? true : false}
                            autoFocus={true}
                            type='text'
                        />
                    </FormControl>
                    <Button variant="contained" color="primary" type="submit"
                            style={{marginLeft: "5%", height: '22px', marginTop: "8px"}}>filter</Button>
                </form>
            </div>
            {courses.map(course =>
                <div style={{
                    width: '100%',
                    height: "8%",
                    display: "inline-block",
                    borderBottom: "1px solid lightgray"
                }}>
                    <h4 style={{marginLeft: "1.2%", marginTop: "9px"}}>Course
                        in {course.country} | {course.price}</h4>
                </div>
            )}
        </div>
            </>
    )
}