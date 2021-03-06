// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

package com.ledger.reactnative;

import co.ledger.core.BitcoinLikeFeePolicy;
import co.ledger.core.BitcoinLikeNetworkParameters;
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

public class RCTCoreBitcoinLikeNetworkParameters extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, BitcoinLikeNetworkParameters> javaObjects;
    public Map<String, BitcoinLikeNetworkParameters> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreBitcoinLikeNetworkParameters(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, BitcoinLikeNetworkParameters>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreBitcoinLikeNetworkParameters";
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
            promise.reject("Failed to release instance of RCTCoreBitcoinLikeNetworkParameters", "First parameter of RCTCoreBitcoinLikeNetworkParameters::release should be an instance of RCTCoreBitcoinLikeNetworkParameters");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, BitcoinLikeNetworkParameters> elem : this.javaObjects.entrySet())
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
    public void init(String Identifier, byte[] P2PKHVersion, byte[] P2SHVersion, byte[] XPUBVersion, BitcoinLikeFeePolicy FeePolicy, long DustAmount, String MessagePrefix, boolean UsesTimestampedTransaction, long TimestampDelay, byte[] SigHash, ReadableArray AdditionalBIPs, Promise promise) {
        ArrayList<String> javaParam_10 = new ArrayList<String>();
        for (int i = 0; i <  AdditionalBIPs.size(); i++)
        {
            String AdditionalBIPs_elem = AdditionalBIPs.getString(i);
            javaParam_10.add(AdditionalBIPs_elem);
        }
        BitcoinLikeNetworkParameters javaResult = new BitcoinLikeNetworkParameters(Identifier, P2PKHVersion, P2SHVersion, XPUBVersion, FeePolicy, DustAmount, MessagePrefix, UsesTimestampedTransaction, TimestampDelay, SigHash, javaParam_10);

        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, javaResult);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreBitcoinLikeNetworkParameters");
        finalResult.putString("uid",uuid);
        promise.resolve(finalResult);
    }
    @ReactMethod
    public void getIdentifier(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            BitcoinLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            String result = javaObj.getIdentifier();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeNetworkParameters::getIdentifier", "First parameter of RCTCoreBitcoinLikeNetworkParameters::getIdentifier should be an instance of RCTCoreBitcoinLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getP2PKHVersion(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            BitcoinLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            byte[] result = javaObj.getP2PKHVersion();
            String converted_result = result.toString();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeNetworkParameters::getP2PKHVersion", "First parameter of RCTCoreBitcoinLikeNetworkParameters::getP2PKHVersion should be an instance of RCTCoreBitcoinLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getP2SHVersion(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            BitcoinLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            byte[] result = javaObj.getP2SHVersion();
            String converted_result = result.toString();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeNetworkParameters::getP2SHVersion", "First parameter of RCTCoreBitcoinLikeNetworkParameters::getP2SHVersion should be an instance of RCTCoreBitcoinLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getXPUBVersion(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            BitcoinLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            byte[] result = javaObj.getXPUBVersion();
            String converted_result = result.toString();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeNetworkParameters::getXPUBVersion", "First parameter of RCTCoreBitcoinLikeNetworkParameters::getXPUBVersion should be an instance of RCTCoreBitcoinLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getFeePolicy(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            BitcoinLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            BitcoinLikeFeePolicy result = javaObj.getFeePolicy();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeNetworkParameters::getFeePolicy", "First parameter of RCTCoreBitcoinLikeNetworkParameters::getFeePolicy should be an instance of RCTCoreBitcoinLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getDustAmount(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            BitcoinLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            long result = javaObj.getDustAmount();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeNetworkParameters::getDustAmount", "First parameter of RCTCoreBitcoinLikeNetworkParameters::getDustAmount should be an instance of RCTCoreBitcoinLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getMessagePrefix(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            BitcoinLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            String result = javaObj.getMessagePrefix();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeNetworkParameters::getMessagePrefix", "First parameter of RCTCoreBitcoinLikeNetworkParameters::getMessagePrefix should be an instance of RCTCoreBitcoinLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getUsesTimestampedTransaction(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            BitcoinLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            boolean result = javaObj.getUsesTimestampedTransaction();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeNetworkParameters::getUsesTimestampedTransaction", "First parameter of RCTCoreBitcoinLikeNetworkParameters::getUsesTimestampedTransaction should be an instance of RCTCoreBitcoinLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getTimestampDelay(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            BitcoinLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            long result = javaObj.getTimestampDelay();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeNetworkParameters::getTimestampDelay", "First parameter of RCTCoreBitcoinLikeNetworkParameters::getTimestampDelay should be an instance of RCTCoreBitcoinLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getSigHash(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            BitcoinLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            byte[] result = javaObj.getSigHash();
            String converted_result = result.toString();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeNetworkParameters::getSigHash", "First parameter of RCTCoreBitcoinLikeNetworkParameters::getSigHash should be an instance of RCTCoreBitcoinLikeNetworkParameters");
        }
    }

    @ReactMethod
    public void getAdditionalBIPs(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            BitcoinLikeNetworkParameters javaObj = this.javaObjects.get(uid);
            ArrayList<String> result = javaObj.getAdditionalBIPs();
            WritableNativeArray converted_result = new WritableNativeArray();
            for (String result_elem : result)
            {
                converted_result.pushString(result_elem);
            }
            promise.resolve(converted_result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreBitcoinLikeNetworkParameters::getAdditionalBIPs", "First parameter of RCTCoreBitcoinLikeNetworkParameters::getAdditionalBIPs should be an instance of RCTCoreBitcoinLikeNetworkParameters");
        }
    }

}
