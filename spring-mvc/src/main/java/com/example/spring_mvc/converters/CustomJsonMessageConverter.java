package com.example.spring_mvc.converters;

import com.example.spring_mvc.model.MyCustomObject;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CustomJsonMessageConverter extends AbstractHttpMessageConverter<MyCustomObject> {

    public CustomJsonMessageConverter() {
        // Define the supported media type
        super(new MediaType("application", "custom-json"));
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return MyCustomObject.class.isAssignableFrom(clazz);
    }

    @Override
    protected MyCustomObject readInternal(Class<? extends MyCustomObject> clazz, HttpInputMessage inputMessage)
            throws IOException {
        // Implement your custom deserialization logic here
        String json = new String(inputMessage.getBody().readAllBytes(), StandardCharsets.UTF_8);
        return convertJsonToMyCustomObject(json);
    }

    @Override
    protected void writeInternal(MyCustomObject myCustomObject, HttpOutputMessage outputMessage)
            throws IOException {
        // Implement your custom serialization logic here
        String json = convertMyCustomObjectToJson(myCustomObject);
        outputMessage.getBody().write(json.getBytes(StandardCharsets.UTF_8));
    }

    private MyCustomObject convertJsonToMyCustomObject(String json) {
        // Your custom deserialization logic
        // For simplicity, just returning a new object
        return new MyCustomObject(json);
    }

    private String convertMyCustomObjectToJson(MyCustomObject myCustomObject) {
        // Your custom serialization logic
        // For simplicity, just returning the object's toString()
        return myCustomObject.toString();
    }
}

