package com.wiki.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FavoritsTests extends TestBase{
  @Test
  public void testAddToFavorits(){
    app.findArticle("Appium");
    app.addToFavorits();
    app.closeArticle();

    app.openMyLists();
    Assert.assertTrue(app.checkArticlePresent());
    //Assert.assertEquals(app.getArticleName(), "Appium");
  }

  @Test
  public void testRemoveFromFavorits(){
    app.openMyLists();
    app.checkArticlePresent();

    //DeleteAtticle (swipeToLeft)
    //CheckListIsEmpty



  }
}
