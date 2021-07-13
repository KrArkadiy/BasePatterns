package main.java.basepatterns.creational.builder;

public class EneterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprise website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);

    }

    @Override
    void buildPrice() {
        website.setPrice(10000);

    }
}
