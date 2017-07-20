package org.ekstep.ep.samza.fixture;

import com.google.gson.Gson;
import org.ekstep.ep.samza.object.dto.GetObjectResponse;

import java.util.Map;

public class GetObjectFixture {
    private static final String OBJECT_REQUEST_JSON = "{" +
            "            \"type\": \"User\",\n" +
            "            \"subtype\": \"\",\n" +
            "            \"id\": \"725\",\n" +
            "            \"parentid\": \"\",\n" +
            "            \"code\": \"\",\n" +
            "            \"name\": \"Amit\",\n" +
            "            \"state\": \"Create\",\n" +
            "            \"prevstate\": \"\",\n" +
            "            \"parenttype\": \"\"\n" +
            "        }\n";


    private static final String OBJECT_RESPONSE_JSON = "{\n" + " " +
            "  \"id\": \"ekstep.object-service.read\",\n" +
            "   \"ver\": \"1.0\",\n" + "   \"ts\": \"\",\n" +
            "   \"params\": {\n" +
            "       \"resmsgid\": \"054f3b10-309f-4552-ae11-02c66640967b\",\n" +
            "       \"msgid\": \"ff305d54-85b4-341b-da2f-eb6b9e5460fa\",\n" +
            "       \"status\": \"successful\",\n" +
            "       \"err\": \"\",\n" +
            "       \"errmsg\": \"\"\n" + "   " +
            "   },\n" +
            "   \"result\": {\n" +
            "         \"id\": \"111\"," +
            "         \"type\": \"User\", " +
            "         \"subtype\": \"Reviewer\", " +
            "         \"parentid\": \"222\", " +
            "         \"parenttype\": \"Admin\", " +
            "         \"code\": \"XYZ\", " +
            "         \"name\": \"User 111\", " +
            "         \"details\": \"{\\\"name\\\":\\\"User 111\\\",\\\"email\\\":\\\"user@ekstep.in\\\",\\\"access\\\":[{\\\"id\\\":\\\"2\\\",\\\"value\\\":\\\"Registered\\\"}],\\\"partners\\\":[],\\\"profile\\\":[]}\" " +
            "   }  \n" +
            "}";

    private static final String PARTNER_OBJECT_RESPONSE_JSON =
            "{\n" +
                    " \n" +
                    "  \"id\": \"ekstep.object-service.read\",\n" +
                    "   \"ver\": \"1.0\",\n" +
                    "   \"ts\": \"\",\n" +
                    "   \"params\": {\n" +
                    "       \"resmsgid\": \"054f3b10-309f-4552-ae11-02c66640967b\",\n" +
                    "       \"msgid\": \"ff305d54-85b4-341b-da2f-eb6b9e5460fa\",\n" +
                    "       \"status\": \"successful\",\n" +
                    "       \"err\": \"\",\n" +
                    "       \"errmsg\": \"\"\n" +
                    "   \n" +
                    "   },\n" +
                    "   \"result\": {\n" +
                    "         \"id\": \"org.ekstep.partner.partner1\",\n" +
                    "         \"type\": \"Partner\", \n" +
                    "         \"subtype\": \"\", \n" +
                    "         \"parentid\": \"\", \n" +
                    "         \"parenttype\": \"\", \n" +
                    "         \"code\": \"\", \n" +
                    "         \"name\": \"Partner 1\", \n" +
                    "         \"details\": null \n" +
                    "   }  \n" +
                    "}";

    private static final String OBJECT_RESPONSE_JSON_WITH_MALFORMED_DETAILS = "{\n" + " " +
            "  \"id\": \"ekstep.object-service.read\",\n" +
            "   \"ver\": \"1.0\",\n" + "   \"ts\": \"\",\n" +
            "   \"params\": {\n" +
            "       \"resmsgid\": \"054f3b10-309f-4552-ae11-02c66640967b\",\n" +
            "       \"msgid\": \"ff305d54-85b4-341b-da2f-eb6b9e5460fa\",\n" +
            "       \"status\": \"successful\",\n" +
            "       \"err\": \"\",\n" +
            "       \"errmsg\": \"\"\n" + "   " +
            "   },\n" +
            "   \"result\": {\n" +
            "         \"id\": \"111\"," +
            "         \"type\": \"User\", " +
            "         \"subtype\": \"Reviewer\", " +
            "         \"parentid\": \"222\", " +
            "         \"parenttype\": \"Admin\", " +
            "         \"code\": \"XYZ\", " +
            "         \"name\": \"User 111\", " +
            "         \"details\": \"\\\"email\\\":\\\"e@mail.com\\\",\\\"channel\\\":\\\"channel 1\\\"}\" " +
            "   }  \n" +
            "}";

    private static final String OBJECT_RESPONSE_JSON_WITH_NO_DETAILS = "{\n" + " " +
            "  \"id\": \"ekstep.object-service.read\",\n" +
            "   \"ver\": \"1.0\",\n" + "   \"ts\": \"\",\n" +
            "   \"params\": {\n" +
            "       \"resmsgid\": \"054f3b10-309f-4552-ae11-02c66640967b\",\n" +
            "       \"msgid\": \"ff305d54-85b4-341b-da2f-eb6b9e5460fa\",\n" +
            "       \"status\": \"successful\",\n" +
            "       \"err\": \"\",\n" +
            "       \"errmsg\": \"\"\n" + "   " +
            "   },\n" +
            "   \"result\": {\n" +
            "         \"id\": \"111\"," +
            "         \"type\": \"User\", " +
            "         \"subtype\": \"Reviewer\", " +
            "         \"parentid\": \"222\", " +
            "         \"parenttype\": \"Admin\", " +
            "         \"code\": \"XYZ\", " +
            "         \"name\": \"User 111\", " +
            "         \"details\": null " +
            "   }  \n" +
            "}";

    private static final String OBJECT_RESPONSE_FAILURE_JSON = "{\n" + " " +
            "  \"id\": \"ekstep.object-service.create_or_update\",\n" +
            "   \"ver\": \"1.0\",\n" + "   \"ts\": \"\",\n" +
            "   \"params\": {\n" +
            "       \"resmsgid\": \"054f3b10-309f-4552-ae11-02c66640967b\",\n" +
            "       \"msgid\": \"ff305d54-85b4-341b-da2f-eb6b9e5460fa\",\n" +
            "       \"status\": \"failed\",\n" +
            "       \"err\": \"BAD_REQUEST\",\n" +
            "       \"errmsg\": \"TYPE IS MANDATORY, ID IS MANDATORY\"\n" + "   " +
            "   },\n" +
            "   \"result\": {\n" +
            "      \"objectid\": null\n" +
            "   }  \n" +
            "}";

    public static Map<String, Object> getObjectRequest() {
        return new Gson().fromJson(OBJECT_REQUEST_JSON, Map.class);
    }

    public static GetObjectResponse getObjectSuccessResponse() {
        return new Gson().fromJson(OBJECT_RESPONSE_JSON, GetObjectResponse.class);
    }

    public static GetObjectResponse getPartnerObjectSuccessResponse() {
        return new Gson().fromJson(PARTNER_OBJECT_RESPONSE_JSON, GetObjectResponse.class);
    }

    public static GetObjectResponse getObjectSuccessResponseWithMalformedDetails() {
        return new Gson().fromJson(OBJECT_RESPONSE_JSON_WITH_MALFORMED_DETAILS, GetObjectResponse.class);
    }

    public static GetObjectResponse getObjectSuccessResponseWithNoDetails() {
        return new Gson().fromJson(OBJECT_RESPONSE_JSON_WITH_NO_DETAILS, GetObjectResponse.class);
    }

    public static GetObjectResponse getFailureResponse() {
        return new Gson().fromJson(OBJECT_RESPONSE_FAILURE_JSON, GetObjectResponse.class);
    }
}