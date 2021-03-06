// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IThumbnailSetRequest;
import com.microsoft.graph.requests.extensions.ThumbnailSetRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Thumbnail Set Request Builder.
 */
public class ThumbnailSetRequestBuilder extends BaseRequestBuilder implements IThumbnailSetRequestBuilder {

    /**
     * The request builder for the ThumbnailSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThumbnailSetRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IThumbnailSetRequest instance
     */
    public IThumbnailSetRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IThumbnailSetRequest instance
     */
    public IThumbnailSetRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ThumbnailSetRequest(getRequestUrl(), getClient(), requestOptions);
    }

    @Override
    public IThumbnailRequestBuilder getThumbnailSize(final String size) {
        return new ThumbnailRequestBuilder(getRequestUrlWithAdditionalSegment(size), getClient(), /* options */ null);
    }

}

