// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_script.djinni

package com.ledger.reactnative;

import co.ledger.core.BitcoinLikeOperator;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class RCTCoreBitcoinLikeOperator extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, BitcoinLikeOperator> javaObjects;
    public Map<String, BitcoinLikeOperator> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreBitcoinLikeOperator(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, BitcoinLikeOperator>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreBitcoinLikeOperator";
    }
    @ReactMethod
    public void release(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            this.javaObjects.remove(uid);
            promise.resolve(0);
        }
        else
        {
            promise.reject("Failed to release instance of RCTCoreBitcoinLikeOperator", "First parameter of RCTCoreBitcoinLikeOperator::release should be an instance of RCTCoreBitcoinLikeOperator");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, BitcoinLikeOperator> elem : this.javaObjects.entrySet())
        {
            result.pushString(elem.getKey());
        }
        promise.resolve(result);
    }
    @ReactMethod
    public void flush(Promise promise)
    {
        this.javaObjects.clear();
        promise.resolve(0);
    }

    @ReactMethod
    public void init(String operatorName, byte value, Promise promise) {
        BitcoinLikeOperator javaResult = new BitcoinLikeOperator(operatorName, value);

        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, javaResult);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreBitcoinLikeOperator");
        finalResult.putString("uid",uuid);
        promise.resolve(finalResult);
    }
    @ReactMethod
    public void getOperatorName(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            BitcoinLikeOperator javaObj = this.javaObjects.get(uid);
            String result = javaObj.getOperatorName();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeOperator::getOperatorName", "First parameter of RCTCoreBitcoinLikeOperator::getOperatorName should be an instance of RCTCoreBitcoinLikeOperator");
        }
    }

    @ReactMethod
    public void getValue(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            BitcoinLikeOperator javaObj = this.javaObjects.get(uid);
            byte result = javaObj.getValue();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeOperator::getValue", "First parameter of RCTCoreBitcoinLikeOperator::getValue should be an instance of RCTCoreBitcoinLikeOperator");
        }
    }

}
