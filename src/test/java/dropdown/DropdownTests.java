package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){

      var dropdownPage =  homePage.clickDropdown();
      String option = "Option 1";
      dropdownPage.selectFormDropDown(option);
      assertEquals(dropdownPage.getSelectedOptions().size(), 1,"Incorrect number is selected");
      assertTrue(dropdownPage.getSelectedOptions().contains(option), "Option not selected");

    }
}
