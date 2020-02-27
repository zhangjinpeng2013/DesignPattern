package com.zjp.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println("----------" + getName() + "-------------");
        for (OrganizationComponent organizationComponent :
                organizationComponents) {
            organizationComponent.print();
        }
    }
}
