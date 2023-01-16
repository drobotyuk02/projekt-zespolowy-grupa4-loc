import Hero from "../components/UI/Hero";
import Content from "../components/UI/Content";
import {useScrollIntoView} from '@mantine/hooks';
import ProductsList from "../components/products/ProductsList.jsx";

const Store = () => {
    const {scrollIntoView, targetRef} = useScrollIntoView({
        offset: 60,
        easing: t => t === 1 ? 1 : 1 - Math.pow(2, -10 * t)
        // easing: (t) => (t < 0.5 ? 16 * Math.pow(t, 5) : 1 - Math.pow(-2 * t + 2, 5) / 2)
        //easing: t => Math.sqrt(1 - Math.pow(t - 1, 2))
        // easing: (x) => {
        //     const n1 = 7.5625;
        //     const d1 = 2.75;
        //
        //     if (x < 1 / d1) {
        //         return n1 * x * x;
        //     } else if (x < 2 / d1) {
        //         return n1 * (x -= 1.5 / d1) * x + 0.75;
        //     } else if (x < 2.5 / d1) {
        //         return n1 * (x -= 2.25 / d1) * x + 0.9375;
        //     } else {
        //         return n1 * (x -= 2.625 / d1) * x + 0.984375;
        //     }
        // }

    });

    return (
        <>
            <Hero scrollFunc={scrollIntoView}/>
            <Content ref={targetRef}>
                <ProductsList/>
            </Content>
        </>
    )
}

export default Store;