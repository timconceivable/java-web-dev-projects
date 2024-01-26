package org.launchcode;

public abstract class BaseDisc {

    private final String discType;
    private final double storageCapacity;
    private final double transferRate;

    public BaseDisc(String discType, double storageCapacity, double transferRate) {
        this.discType = discType;
        this.storageCapacity = storageCapacity;
        this.transferRate = transferRate;
    }

    public void spinDisc() {
        System.out.println("A " + getDiscType() + " can hold up to " + getStorageCapacity() + " GB and has a data transfer rate of about " + getTransferRate() + " mbps.");
    }

    public void playMedia() {
        System.out.println("The " + discType + " is now playing.");
    }

    public String getDiscType() {
        return discType;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public double getTransferRate() {
        return transferRate;
    }
}
