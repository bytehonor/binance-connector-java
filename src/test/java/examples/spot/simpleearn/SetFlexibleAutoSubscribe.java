package examples.spot.simpleearn;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class SetFlexibleAutoSubscribe {
    private SetFlexibleAutoSubscribe() {
    }
    
    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("productId", "40607");
        parameters.put("autoSubscribe", true);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSimpleEarn().setFlexibleAutoSubscribe(parameters);
        System.out.println(result);
    }
}
