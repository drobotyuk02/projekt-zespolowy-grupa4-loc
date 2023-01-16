import { useContext } from "react";
import {Paper, Text} from "@mantine/core";
import CartContext from "../../context2/cart-context.jsx";

const CartModal = () => {

     useContext(CartContext);

    return (
        <>
            <Paper>
                <Text weight={600}
                      variant="gradient"
                      gradient={{ from: 'indigo', to: 'cyan', deg: 45 }}
                      sx={{ fontFamily: 'Greycliff CF, sans-serif' }}
                      ta="center"
                      fz="xl"
                      fw={700}
                >
                    There are no items in shopping cart!
                </Text>
            </Paper>
        </>
    );
}

export default CartModal;