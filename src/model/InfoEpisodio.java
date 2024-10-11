package model;

import com.google.gson.annotations.SerializedName;

public record InfoEpisodio(@SerializedName("Title") String titulo,
                           @SerializedName("Episode") Integer numero,
                           @SerializedName("imdbRating") String avaliacao,
                           @SerializedName("Released") String dataLancamento) {
}
