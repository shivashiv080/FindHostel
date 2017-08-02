package com.vitaltechlabs.findhostels.serverapis;

/**
 * Created by RuchiTiwari on 1/14/2017.
 */

public class ApiConstants {
    public static final String appVersion = "5.1.7";
    public static String osVersion = "";
    // Test
//    private static final String ipAddress = "http://124.30.176.154:90/Service.asmx";
//    private static final String ipAddress2 = "http://124.30.176.154:91/Service.asmx";

    // Alpha
    private static final String ipAddress = "http://104.211.96.182:90/Service.asmx";
    private static final String ipAddress2 = "http://104.211.96.182:90/Service.asmx";
    private static final String BASE_URL =  "http://findhostels.in/webservices/";

    public static final String loginUrl = BASE_URL + "hostel_login.php";
    public static final String getUserUrl = ipAddress2 + "/Get_User";
    public static final String cityurl = ipAddress + "/GetCityStateList";
    public static final String cityListurl = ipAddress + "/?Device_ID=009&DEVICE_TOKEN=1&OSTYPE=ANDROID&OSVERSION=1&MYSRLVER=1";
    public static final String pendingRegistrationUrl = ipAddress + "/PendingRegistration";
    public static final String userRegistrationUrl = ipAddress + "/UserRegistration";
    public static final String resendOTPUrl = ipAddress + "/ResendOTP";
    public static final String validateRegistrationUrl = ipAddress + "/ValidateRegistration";
    public static final String forgotPwdUrl = ipAddress + "/ForgotPassword";
    public static final String getREportsUrl = ipAddress + "/FetchDataNew";
    public static final String getPromoUrl = ipAddress + "/GetPromocode";

    public static final String getTopProductsUrl = ipAddress + "/GetTopProducts";
    public static final String getCarouselsUrl = ipAddress + "/GetPromotionOffers";
    public static final String filterProductsUrl = ipAddress + "/FilterProducts";
    public static final String getPackageDetailsUrl = ipAddress + "/GetPackageDetails";
    public static final String getPaySuccessUrl = ipAddress + "/PaymentStatus_Options";
    public static final String getAllCategoriesUrl = ipAddress + "/GetAllCategories";
    public static final String myCartUrl = ipAddress + "/MyCartDetails";
    public static final String getLabLocationsUrl = ipAddress + "/SearchLocations_OnMap";
    public static final String getPromotionOffersUrl = ipAddress + "/GetPromotionOffers"; //Offers List
    public static final String getOrdersUrl = ipAddress + "/GetOrderHistory_Product";
    public static final String getPayUrl = ipAddress + "/CreateOrder_Guest";

    public static final String getUserDetailsUrl = ipAddress + "/Get_User";   //Profile Details
    public static final String updateUserDetails = ipAddress + "/UpdateProfile"; //Profile Update
    public static final String validatePromoUrl = ipAddress + "/ValidatePromocode";
    public static final String searchProductsUrl = ipAddress + "/Search_Test";
    public static final String getpdfUrl = ipAddress + "/GetResultReport";
    public static final String getContentUrl = ipAddress + "/GetContent";
    public static final String changePasswordURl = ipAddress + "/ChangePassword";
    public static final String TRACK_ORDERURL = ipAddress + "/TrackYourOrder";
    public static final String REPEAT_ORDERURL = ipAddress + "/RepeateOrder";
    public static final String CANCEL_ORDERURL = ipAddress + "/CancelOrder";

    public static final String getFeedbackUrl = ipAddress + "/GetFeedback"; //feedback
    public static final String getNotificationUrl = ipAddress + "/GetNotification"; //notification
    public static final String deleteNotificationUrl = ipAddress + "/DeleteNotification"; //notification
    public static final String validatemobikwikurl = "http://test.mobikwik.com/wallet";

    public static final String allStatesurl = ipAddress + "/GetAllStates";
    public static final String citiesurl = ipAddress + "/GetCities";

    public static final String paytmStatusurl = "http://secure.paytm.in/oltp/HANDLER_INTERNAL/TXNSTATUS";
}
