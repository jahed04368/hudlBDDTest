package Locators;

public class Locators {
    public interface hudlHomepage
    {
        //all the locators on Hudl Homepage
        String loginButton = "xpath=//*[@class=\"btn__blue login\"]";
        String email = "xpath=//*[@id=\"email\"]";
        String password = "xpath=//*[@id=\"password\"]";
        String loginButton2 = "id=logIn";
        String invalidEmailOrPassword = "xpath=//div[@class=\"login-error-container\"]";
        String signUp = "xpath=//*[@class=\"btn__dark signup\"]";
    }
    public interface usersHome
    {
        //all the locators on users Homepage
        String searchTextBox = "xpath=//*[@id=\"explore-header\"]/div[1]/div[1]/div[1]/input";
        String liverpoolLink = "xpath=//*[@href=\"/profiles/feed-user/2-441518\"]";
        String yourTeam = "xpath=//*[@id=\"explore-header\"]/div[2]/div[4]/div/div/span";
        String video = "xpath=//*[@id=\"feed_w\"]/div/div/div[2]/div/div[1]/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div/div";
        String frame = "xpath=//*[@id=\"main\"]";
        String profile = "xpath=//*[@class=\"hui-globaluseritem__display-name\"]";
        String logOut = "link=Log Out";

    }
    public interface signUp
    {
        //all the locators on sign up page
        String signUp = "xpath=//*[@class=\"btn__dark signup\"]";
        String newTeam = "xpath=//*[@href=\"/gethudl/team\"]";
        String secondarySchool = "xpath=//input[@id=\"uniId_2\"]";
        String continueButton = "xpath=//*[@class=\"uni-btn--primary uni-btn--medium\"]";
        String football = "xpath=//span[@data-qa-id=\"signup_sport_Football\"]";
        String goldPackage = "xpath=//a[@data-qa-id=\"signup_package_Gold\"]";
        String organizationName = "id=organizationName";
        String teamName = "id=teamName";
        String leagueName = "id=leagueName";
        String address = "id=address1";
        String address2 = "id=address2";
        String city = "id=city";
        String postalCode = "id=zip";
        String firstName = "id=firstName";
        String lastName = "id=lastName";
        String email = "id=email";
        String password = "xpath=//input[@type=\"password\"]";
        String phoneNumber = "id=phonenumber";
        String createAccount = "xpath=//span[@data-qa-id=\"signup_submit_create_account\"]";
        String letsGo = "xpath=//*[@class=\"uni-btn--primary uni-btn--large\"]";

    }
}

