public class ManageUserProfile {
    private UserAuthentication authentication=new UserAuthentication();
    private UserProfile profile=new UserProfile();
    private UserPreference preference=new UserPreference();

    private boolean authenticate(String username,String password){
        return authentication.authenticate(username,password);
    }

    private void updateUserProfile(String username,UserProfileInfo userProfileInfo){
        profile.updateUserProfile(username,userProfileInfo);
    }

    private void updateUserPreference(String username, UserProfileInfo userProfileInfo){
        preference.updateUserPreference(username,userProfileInfo);
    }
}
