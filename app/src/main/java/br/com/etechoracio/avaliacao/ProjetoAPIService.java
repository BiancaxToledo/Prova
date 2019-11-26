package br.com.etechoracio.avaliacao;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProjetoAPIService {
    @GET(".")
    Call<String> Numero1 (@Path("num1") String num1);
    Call<String> Numero2 (@Path("num2") String num2);
}
