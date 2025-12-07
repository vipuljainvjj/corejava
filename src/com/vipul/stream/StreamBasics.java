package com.vipul.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(0, i -> i ++).limit(10);

        stream.map( (Integer i) -> new FXRequest())// return FXRequest which will act as a input for next intermediate operation
                .map((FXRequest request) -> {
                    return getFXResponse(request);
                })
                 .map(response -> isWorking() ? "" : "")
                .collect(Collectors.toList());
    }

    public static boolean isWorking() {
        return true;
    }

    public static FXResponse getFXResponse(FXRequest fxRequest) {
        return new FXResponse();
    }
}

class FXRequest {}
class FXResponse {}