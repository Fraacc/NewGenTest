
import photo from "../assets/Schermata da 2022-05-23 19-07-21.png"
import {Button} from "@mui/material";
import {useNavigate} from "react-router-dom";



export function Page1(){

    const history = useNavigate()

    return (
        <>
            <div style={{position: "absolute"}}>
                <img src={photo}/>
                <Button onClick={() => history("/en/home")} style={{position: "absolute", right: "4.5%", top: "5.1%", backgroundColor: "inherit", width: "4%", height:"67px", border: "0px"}}></Button>
            </div>
        </>
    );
}

