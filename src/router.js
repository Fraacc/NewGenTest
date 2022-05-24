import { Route, Routes } from 'react-router'
import {Page1} from "./view/Page1";
import Page2 from "./view/Page2";


export const routes = () => {

    const redirect = (<Route from='*' to='/'/>)
        return (
            <Routes>
                <Route key={0} path={'/'} exact={true} element={<Page1/>}/>
                <Route key={0} path={'/en/home'} exact={true} element={<Page2/>}/>
            </Routes>
        )
    }
