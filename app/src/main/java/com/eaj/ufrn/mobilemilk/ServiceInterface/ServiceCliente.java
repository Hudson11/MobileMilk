package com.eaj.ufrn.mobilemilk.ServiceInterface;

import com.eaj.ufrn.mobilemilk.Modelo.Cliente;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ServiceCliente {

    @GET("/cliente/{cpf}")
    Call<Cliente> buscarClienteCpf(@Path("cpf") String cliente);

    @GET("/cliente")
    Call<Cliente> listaClientes();

    @POST("/cliente")
    Call<Cliente> cadastrarCliente(@Body Cliente cliente);

    @DELETE("/cliente/{cpf}")
    Call<ResponseBody> deletarCliente(@Path("cpf") int cpf);

    @PUT("/cliente/{cpf}")
    Call<ResponseBody> editarCliente(@Path("cpf") int cpf);

}