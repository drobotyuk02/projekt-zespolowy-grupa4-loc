import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import NavbarComponent from './components/Navbar';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Cancel from './pages/Cancel';
import Store from './pages/Store';
import Success from './pages/Success';
import CartProvider from './CartContext';
import { Container } from "react-bootstrap";
import { Link } from 'react-router-dom';
import { ProSidebar, Menu, MenuItem, SubMenu } from "react-pro-sidebar";
import "react-pro-sidebar/dist/css/styles.css";
// localhost:3000 -> Home
// localhost:3000/success -> Success

function App() {
  return (
    <>
      <CartProvider>
      <div className="App">
        <NavbarComponent></NavbarComponent>
        <h1>Welcome to the Bookly!</h1>
        <ProSidebar className="sidebar">
          <Menu iconShape="square">
            <MenuItem>Dashboard</MenuItem>
            <SubMenu title="Components">
              <MenuItem>Component 1</MenuItem>
              <MenuItem>Component 2</MenuItem>
            </SubMenu>
            <SubMenu title="Components"> Menu</SubMenu>
            <MenuItem >Dashboard</MenuItem>
          </Menu>
        </ProSidebar>
          <Container>
            <BrowserRouter>
              <Routes>
                <Route index element={<Store />} />
                <Route path="success" element={<Success />} />
                <Route path="cancel" element={<Cancel />} />
              </Routes>
            </BrowserRouter>
          </Container>
      </div>
      </CartProvider>
    </>
  );
}

export default App;