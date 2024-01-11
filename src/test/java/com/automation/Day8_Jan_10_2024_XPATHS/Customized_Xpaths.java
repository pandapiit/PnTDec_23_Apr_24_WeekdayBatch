package com.automation.Day8_Jan_10_2024_XPATHS;

public class Customized_Xpaths {
//traverse means movement within the html tags
//represented by a forward slash

//parent
//child
//ancestor
//descendant
//following-sibling
//preceding-sibling
//following
//preceding
//self

//li[@class = 'logo']/descendant::img[1]
//ul[@id = 'first-level-nav']/descendant::img[1]
//nav[@id = 'nav-website']/descendant::img[1]
//div[@id = 'banner_android']/following-sibling::nav[1]/descendant::img[1]
//div[@id = 'banner_android']/following::img[1]

//a[@class = 'signin']/following-sibling::a[1]
//p[@id = 'signin_info']/child::a[2]
//p[@id = 'signin_info']/child::a[text() = 'Create Account']
//p[@id = 'signin_info']/child::a[contains(text(), 'Create Account')]

//div[@id = 'red_container_main']/preceding::a[text() = 'Create Account']
//div[@id = 'red_container_main']/preceding-sibling::div[@class = 'srchbar clear-fix relative']/preceding::a[1]

//a[@class = 'signin']/parent::p
//a[@class = 'signin']/parent::p[1]
//a[@class = 'signin']/parent::*





}
