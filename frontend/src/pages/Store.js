import {Row, Col} from 'react-bootstrap';
import { productsArray } from '../productsStore';
import ProductCard from '../components/ProductCard';
//import SidebarMenuComponent from '../components/SidebarMenuComponent';
import "react-pro-sidebar/dist/css/styles.css";
import 'bootstrap/dist/css/bootstrap.min.css';
import "react-pro-sidebar/dist/css/styles.css";
import NavbarComponent from '../components/Navbar';
import '../App.css';


function Store(){
    return(
        <> 
            <NavbarComponent></NavbarComponent>
            <Row xs={1} md={3} className="g-4">
                {productsArray.map((product, idx) => (
                <Col align="center" key={idx}>
                    <ProductCard product={product}/>
                </Col>
                ))}
            </Row>
        </> // </> <-- this is fragment
    ) 
}

export default Store;