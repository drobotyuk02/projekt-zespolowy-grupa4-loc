import './App.css';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import CartProvider from './context2/CartProvider';
// import CartProvider from './context/CartContext';
import {Container} from '@mantine/core';
import FooterRouter from './components/footer/FooterRouter';
import Store from "./pages/Store";
import AuthRouter from "./components/authentification/AuthRouter.jsx";
import SingleProduct from "./pages/SingleProduct.jsx";
// import Cancel from './pages/Cancel';
// import Store from './pages/Store';
// import Success from './pages/Success';
// import AdminPanel from './pages/AdminPanel';
// import { Link } from 'react-router-dom';

function App() {
    return (
        <CartProvider>
            <Container fluid={true}>
                <BrowserRouter>
                    <Routes>
                        <Route index path="/" element={<Store/>}/>
                        <Route path="/product/:id" element={<SingleProduct/>}/>
                    </Routes>

                    <AuthRouter/>
                    <FooterRouter/>

                    {/*<Route path="success" element={<Success />} />*/}
                    {/*<Route path="cancel" element={<Cancel />} />*/}

                    {/*<Route path="adminPanel" element={<AdminPanel />} />*/}
                </BrowserRouter>
            </Container>
        </CartProvider>
    );
}

export default App;