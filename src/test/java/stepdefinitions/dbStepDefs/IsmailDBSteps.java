package stepdefinitions.dbStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IsmailDBSteps {

    Connection con;
    Statement stmt;
    @Given("Database connection is setup")
    public void databaseConnectionIsSetup() throws SQLException {

        //Setup database connection
       DBUtils.getConnection();
       //Create the statement
       DBUtils.getStatement();

    }

    @Then("The username {string} provided is checked in the DB systsem for its uniqueness")
    public void theUsernameProvidedIsCheckedInTheDBSystsemForItsUniqueness(String username) throws SQLException {

        //step 3
        String s ="select * from jhi_user where login='"+username+"'";

       //Execute the query above and assign it to a resultset
        ResultSet rs = DBUtils.executeQuery(s);

        if (rs.next()){
            DBUtils.closeConnection();
            Assert.assertNotEquals(username,rs.getString("login").toLowerCase());
            System.out.println("This username is already in the database");

        } else{
            DBUtils.closeConnection();
            System.out.println("This username is not in the database");
            Assert.assertTrue(true);
        }

    }


    @Then("the ssn {string} is checked in the database and get data")
    public void theSsnIsCheckedInTheDatabaseAndGetData(String ssn) throws SQLException {

        String s = "Select ssn from jhi_user where ssn='"+ssn+"'";

       ResultSet rs= DBUtils.executeQuery(s);
        rs.next();
        Assert.assertEquals(ssn,rs.getString("ssn"));

    }
}
