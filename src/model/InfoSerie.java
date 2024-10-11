package model;

import com.google.gson.annotations.SerializedName;

public record InfoSerie(@SerializedName("Title") String titulo,
                        @SerializedName("totalSeasons") Integer totalTemporadas,
                        @SerializedName("imdbRating") String avaliacao) {
}
