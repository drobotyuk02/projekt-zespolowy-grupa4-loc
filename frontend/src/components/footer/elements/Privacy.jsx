import React from "react";
import {Text, Paper, Divider, Container, Center} from '@mantine/core';

const Privacy = () => {
    //can i get an (an, deamn you right)awa awa?0_0 awa awa
    //im not here btw
    //enjoy coding with youself :)
    // thx brother i will, i want to learn how to parse JSON and NOT to be st2pid
    // ............ I ...... am so tired to use always internet for this topic...
    // I know how to use it, but i am not sure.....
    // using for YT is not enough? xd
    //ou....
    //ok, alright, i need it
    //[{},{},{}] <-- typo data collection? collection of objects
    //mhm, ok then.

    //omg bro, are you for real now?...............................
    //then you are yusing it the wrong way

    //i sent you SWAGGER docs, didnt i? you can see what response data will look like there
    //for :id requests it will be simple {} object with named fields <- then parse as usual
    //for general /api/*endpoint* it will be [{}, {}, {}], so you should probably use .map() on that response
    //parsing json 101
    //OR
    //i can wrap every response in response wrapper, and you will ALWAYS get smthing like. 0_0 <- my honest reaction to this information
    // {
        // status: 200,
        // data: [{}, {}, {}] || {}
    // } <- btw that's how our error response looks like, but with timestamp and message fields (just these two)

    //good then, I will save it
    // do we have SWAGGER in our project already? or it not working like that? installed i mean.

    //swagger is only workey when serwer is up....... but docs i sent you are still valid
    // ou

    //then parse ur data field
    return (

        <Container>
            <Paper shadow="lg" radius="md" p="xl">
                <h1>Privacy Policy</h1>
                <Text>2023-01-03</Text>
                <Divider></Divider>
                <Text>
                    A. COLLECTION OF INFORMATION.
                </Text>

                <Text>
                    ● Information you provide to us
                </Text>
                <Text>
                    ● Information that we collect automatically
                </Text>
                <Text>
                    ● Information that we receive from third parties
                </Text>
                <Divider></Divider>
                <Text>
                    B.USE OF PERSONAL INFORMATION.
                </Text>
                <Text>
                    The personal information that we may collect about you broadly falls into the following categories:
                </Text>
                <Text>
                    Information you provide to us
                </Text>
                <Text>
                    If you are a representative or employee of any Buyer or Seller or a sole trader Buyer or Seller:
                </Text>
                <Text>
                    ● you will be asked to provide certain contact information that is necessary for the registering for
                    a Platform account on behalf of a Buyer or Seller, including name, address, phone number, email
                    address, job title and department;
                </Text>
                <Text>
                    ● you will be asked to provide certain identity information, tax registration and/or related
                    information about your business, such as your company name, business type and industry,
                    corporate registration details and information about your business license;
                </Text>
                <Text>
                    ● if you are a Seller we will also ask you to provide details about the goods and products
                    that you intend to sell via the Platform and details about your sales/transactions on
                    Bookly.com;
                </Text>
                <Text>
                    ● if you are a Buyer we will also ask you to provide details or preferences about the
                    goods and products that you may be interested in buying via the Platform and any details
                    or preferences relevant to your purchases;
                </Text>
                <Text>
                    ● if you are successfully certified by Alibaba.com as a blogger or an influencer, in
                    addition to the information mentioned above, we may also collect your live stream
                    videos, your social media account names and profile photos, and posts or comments
                    made by other users of the Platform;
                </Text>
                <Text>
                    ● in connection with the facilitation of transactions, purchases and payments
                    over the Platform, you will be asked to provide certain payment information.
                    This might include bank account numbers, billing and delivery information,
                    credit/debit card numbers, expiration dates and security code and tracking
                    information from cheques or money orders to facilitate the sale and purchase as
                    well as the settlement of purchase price of the products or services transacted
                    on or procured through the Platform;
                </Text>
                <Text>
                    ● we will process any information provided to us in connection with disputes or
                    to support complaints in connection with the Platform or goods and/or services
                    purchased via the Platform. Please note, Buyers and/or Sellers may submit
                    complaints regarding the products and services on the Platform and/or disputes
                    between the Buyers and Sellers to the Platform and under such circumstances, we
                    will process data provided to us by Buyers and/or Sellers that is relevant to
                    the disputes or complaints submitted. This may include health data of end-users
                    (which may include minors as applicable) of products purchased on the Platform
                    to the extent relevant to the disputes or complaints that are being reviewed by
                    the Platform and to the extent that the individual(s) has provided their
                    explicit consent to their data being shared with us for the purposes of handling
                    the complaints and/or settling the disputes.
                </Text>
                <Text>
                    ● Information you submit to the Platform for publication may be made publicly
                    available on the Platform and therefore accessible by any internet user. You
                    should exercise caution when deciding what information you submit to us for
                    publication.
                </Text>
                <Text>
                    ● in order to facilitate your use of the services available on the Platform
                    (including on websites and/or mobile applications), we may request for access
                    to, and you may provide us with, contents stored in your devices including but
                    not limited to contacts in address book, photos, videos and/or other files. If
                    you are using our communication tools on the Platform (particularly in case of
                    voice communication), we may require access to your camera and/or microphone,
                    and may conduct voice recordings.
                </Text>
            </Paper>
        </Container>
    );
}

export default Privacy;