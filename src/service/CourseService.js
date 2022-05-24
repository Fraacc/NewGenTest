import http from "./RestService";


export const getAll = () => {
    return http.post("course/getAll")

}

export const getAllWithParams = (data) => {
    return http.post("course/getAllWithParams?country="+data.country+"&price1="+data.price1+"&price2="+data.price2)

}


