package stepDefinition;

import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static pages.ProductCategoryPage.visibilityProductCategory;

public class ProductCategoryPage {
    @Then("^User should be able to view the product category page$")
    public void user_should_be_able_to_view_the_product_category_page() throws InterruptedException {
       String actualProductCategory = visibilityProductCategory();
       assertEquals(actualProductCategory,"Formal Shoes");
        }
}
