package com.itfyme.collegesystem.dbservices;

import android.content.Context;

import com.itfyme.collegesystem.interfaces.ResponseHandler;
import com.itfyme.collegesystem.network.VolleyNetworkManager;

import java.util.HashMap;

public class CityService {

    Context mContext;
    private String getListByPageURL="city/get-list-object-page";
    private String getListURL="city/get-list";
    private String getURL="";
    private String addURL="city/add";
    private String updateURL="city/update";
    private String deleteURL="";
    public CityService(Context context) {
        mContext = context;

    }

    public void getCityListByPage(HashMap<String, String> params, ResponseHandler responseHandler) {
        new VolleyNetworkManager(mContext).getRequest(getListByPageURL, params, new ResponseHandler() {
            @Override
            public void onSuccess(Object data) {
                try {
                    responseHandler.onSuccess(data);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFail(Object data) {
                responseHandler.onFail("Failed to load data");

            }

            @Override
            public void onNoData(Object data) {
                responseHandler.onFail("No data available");
            }
        });


    }
    public void getCityList(HashMap<String, String> params, ResponseHandler responseHandler) {
        new VolleyNetworkManager(mContext).getRequest(getListURL, params, new ResponseHandler() {
            @Override
            public void onSuccess(Object data) {
                try {
                    responseHandler.onSuccess(data);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFail(Object data) {
                responseHandler.onFail("Failed to load data");

            }

            @Override
            public void onNoData(Object data) {
                responseHandler.onFail("No data available");
            }
        });


    }

    public void getCity(HashMap<String, String> params, ResponseHandler responseHandler) {
        new VolleyNetworkManager(mContext).getRequest(getURL, params, new ResponseHandler() {
            @Override
            public void onSuccess(Object data) {
                try {
                    responseHandler.onSuccess(data);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFail(Object data) {
                responseHandler.onFail("Failed to load data");

            }

            @Override
            public void onNoData(Object data) {
                responseHandler.onFail("No data available");
            }
        });


    }
    public void addCity(HashMap<String, String> params, ResponseHandler responseHandler) {
        new VolleyNetworkManager(mContext).postRequest(addURL, params, new ResponseHandler() {
            @Override
            public void onSuccess(Object data) {
                try {
                    responseHandler.onSuccess(data);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFail(Object data) {
                responseHandler.onFail("Failed to add data");

            }

            @Override
            public void onNoData(Object data) {

            }
        });


    }
    public void updateCity(HashMap<String, String> params, ResponseHandler responseHandler) {
        new VolleyNetworkManager(mContext).postRequest(updateURL, params, new ResponseHandler() {
            @Override
            public void onSuccess(Object data) {
                try {
                    responseHandler.onSuccess(data);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFail(Object data) {
                responseHandler.onFail("Failed to update data");

            }

            @Override
            public void onNoData(Object data) {

            }
        });


    }
    public void deleteCity(String id, ResponseHandler responseHandler) {
        HashMap<String, String> params=new HashMap<>();
        params.put("city_id",id);
        new VolleyNetworkManager(mContext).postRequest(deleteURL, params, new ResponseHandler() {
            @Override
            public void onSuccess(Object data) {
                try {
                    responseHandler.onSuccess(data);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFail(Object data) {
                responseHandler.onFail("Failed to delete data");

            }

            @Override
            public void onNoData(Object data) {

            }
        });


    }

}
