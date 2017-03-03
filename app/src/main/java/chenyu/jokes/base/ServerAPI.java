package chenyu.jokes.base;

import chenyu.jokes.model.Response;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by chenyu on 2017/3/3.
 */

public interface ServerAPI {
  public static final String ENDPOINT = "http://***REMOVED***/joke";
  public static final String API_KEY = "***REMOVED***";

  @GET("/content/list.from") Observable<Response> getJokes(
      @Query("key") String api_key,
      @Query("sort") String sort,
      @Query("page") int page,
      @Query("pagesize") int pagesize,
      @Query("time") String time
  );
}