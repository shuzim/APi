package model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public record InfoTemporada(@SerializedName("Season") Integer numero,
                            @SerializedName("Episodes") List<InfoTemporada> episodios) {
}
