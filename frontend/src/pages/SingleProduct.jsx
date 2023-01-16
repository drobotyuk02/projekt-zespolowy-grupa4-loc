import {useParams} from "react-router-dom";
import {Container} from "@mantine/core";
import {useEffect} from "react";
import axios from "axios";

const SingleProduct = () => {
    // there will be an ID of a product passed as a path param (and other query values)
    const params = useParams();

    let product;

    //get product via  axios.get("/api/products/{id}") -> returns a Promise

    useEffect( () => {
        async function fetchProduct() {
            const resp = await axios.get(`http://localhost:8082/api/products/${params.id}`)
            return resp.data;
        }

        if (params.id) {
            product = fetchProduct()
        } //handle error or empty for else
    }, [])

    return (
        <Container>
            <div>
                something about product
                {/*bookmark system maybe? just as a future feature*/}
                <div>comment section?</div> {/*with some adjustments to datamodel.... again.......*/}
            </div>
        </Container>
    );
}

export default SingleProduct;
