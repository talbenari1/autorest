/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package storage.implementation;

import retrofit2.Retrofit;
import .Usages;
import .models.UsageListResult;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Usages.
 */
public class UsagesImpl implements Usages {
    /** The Retrofit service to perform REST calls. */
    private UsagesService service;
    /** The service client containing this operation class. */
    private StorageManagementClientImpl client;

    /**
     * Initializes an instance of Usages.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public UsagesImpl(Retrofit retrofit, StorageManagementClientImpl client) {
        this.service = retrofit.create(UsagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Usages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface UsagesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: .Usages list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Storage/usages")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion);

    }

    /**
     * Gets the current usage count and the limit for the resources under the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UsageListResult object if successful.
     */
    public UsageListResult list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets the current usage count and the limit for the resources under the subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UsageListResult> listAsync(final ServiceCallback<UsageListResult> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets the current usage count and the limit for the resources under the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UsageListResult object
     */
    public Observable<UsageListResult> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<UsageListResult>, UsageListResult>() {
            @Override
            public UsageListResult call(ServiceResponse<UsageListResult> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the current usage count and the limit for the resources under the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UsageListResult object
     */
    public Observable<ServiceResponse<UsageListResult>> listWithServiceResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UsageListResult>>>() {
                @Override
                public Observable<ServiceResponse<UsageListResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UsageListResult> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<UsageListResult> listDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<UsageListResult, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<UsageListResult>() { }.getType())
                .build(response);
    }

}
