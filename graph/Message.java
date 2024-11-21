package graph;

import java.util.Date;

public class Message {
    public final byte[] data;
    public final String asText;
    public final double asDouble;
    public final Date date;
    
    public Message(String asText) {
        this.date = new Date();
        this.asText = asText;
        this.data = asText.getBytes(StandardCharsets.UTF_8);
        try {
            this.asDouble = Double.parseDouble(asText);
        } catch (NumberFormatException e) {
            this.asDouble = Double.NaN;
        }

    }

    public Message(byte[] data){
        this(new String(data, StandardCharsets.UTF_8));
    }

    public Message(double asDouble){
        this(Double.toString(asDouble));
    }
}
