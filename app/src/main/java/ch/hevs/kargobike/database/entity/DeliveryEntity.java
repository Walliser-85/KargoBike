package ch.hevs.kargobike.database.entity;

import java.util.Date;

public class DeliveryEntity {
    private String idDelivery;
    private String toCutomer;
    private String toBundle;
    private String toPackage;
    private String toBill;
    private String toDeliveryStatus;
    private String description;
    private String nbProducts;
    private Date deliverDateTime;
    private String departurePlace;
    private String finalDestination;
    private String signature;
    private byte[] proofPicture;

    public DeliveryEntity(){}

    public DeliveryEntity(String toCutomer, String toBundle, String toPackage, String toBill, String toDeliveryStatus, String description, String nbProducts, Date deliverDateTime, String departurePlace, String finalDestination, String signature) {
        this.toCutomer = toCutomer;
        this.toBundle = toBundle;
        this.toPackage = toPackage;
        this.toBill = toBill;
        this.toDeliveryStatus = toDeliveryStatus;
        this.description = description;
        this.nbProducts = nbProducts;
        this.deliverDateTime = deliverDateTime;
        this.departurePlace = departurePlace;
        this.finalDestination = finalDestination;
        this.signature = signature;
    }

    public String getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(String idDelivery) {
        this.idDelivery = idDelivery;
    }

    public String getToCutomer() {
        return toCutomer;
    }

    public void setToCutomer(String toCutomer) {
        this.toCutomer = toCutomer;
    }

    public String getToBundle() {
        return toBundle;
    }

    public void setToBundle(String toBundle) {
        this.toBundle = toBundle;
    }

    public String getToPackage() {
        return toPackage;
    }

    public void setToPackage(String toPackage) {
        this.toPackage = toPackage;
    }

    public String getToBill() {
        return toBill;
    }

    public void setToBill(String toBill) {
        this.toBill = toBill;
    }

    public String getToDeliveryStatus() {
        return toDeliveryStatus;
    }

    public void setToDeliveryStatus(String toDeliveryStatus) {
        this.toDeliveryStatus = toDeliveryStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNbProducts() {
        return nbProducts;
    }

    public void setNbProducts(String nbProducts) {
        this.nbProducts = nbProducts;
    }

    public Date getDeliverDateTime() {
        return deliverDateTime;
    }

    public void setDeliverDateTime(Date deliverDateTime) {
        this.deliverDateTime = deliverDateTime;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public byte[] getProofPicture() {
        return proofPicture;
    }

    public void setProofPicture(byte[] proofPicture) {
        this.proofPicture = proofPicture;
    }
}
