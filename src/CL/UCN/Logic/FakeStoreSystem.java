package CL.UCN.Logic;

public interface FakeStoreSystem
{
    /**
     * login
     * verify if user exist
     * @param userName
     * @param password
     * @return true if User Exist esle false
     */
	public boolean login(String userName, String password);
        /**
         * register
         * add new user at system
         * @param userName
         * @param fName
         * @param mail
         * @param phone
         * @param password
         * @return true if new user registered
         */
        public boolean register(String userName, String fName, String mail, String phone, String password);
        
}
