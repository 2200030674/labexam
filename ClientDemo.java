package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Device device = new Device();
        device.setBrand("GenericBrand");
        device.setModel("GenericModel");
        device.setPrice(300);
        session.save(device);

        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Samsung");
        smartphone.setModel("Galaxy S23");
        smartphone.setPrice(999.99);
        smartphone.setOperatingSystem("Android");
        smartphone.setCameraResolution("108 MP");
        session.save(smartphone);

        Tablet tablet = new Tablet();
        tablet.setBrand("Apple");
        tablet.setModel("iPad Pro");
        tablet.setPrice(1299.99);
        tablet.setScreenSize(12.9);
        tablet.setBatteryLife(10);
        session.save(tablet);

        transaction.commit();
        session.close();

        System.out.println("Records inserted successfully.");
    }
}
