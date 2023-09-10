import java.util.*;

public class DataPacket {
//    private String unitAddress;
    private String message;
    public DataPacket(){

    }

    public DataPacket(String unitAddress, String message) {
//        this.unitAddress = unitAddress;
        this.message = message;
    }
//    public String getUnitAddress() {
//        return unitAddress;
//    }
    public String getMessage() {
        return message;
    }
}
