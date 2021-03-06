// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IOfficeGraphInsightsRequest;
import com.microsoft.graph.requests.extensions.ITrendingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITrendingRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedInsightRequestBuilder;
import com.microsoft.graph.requests.extensions.IUsedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUsedInsightRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Office Graph Insights Request Builder.
 */
public interface IOfficeGraphInsightsRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IOfficeGraphInsightsRequest instance
     */
    IOfficeGraphInsightsRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IOfficeGraphInsightsRequest instance
     */
    IOfficeGraphInsightsRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    ITrendingCollectionRequestBuilder trending();

    ITrendingRequestBuilder trending(final String id);

    ISharedInsightCollectionRequestBuilder shared();

    ISharedInsightRequestBuilder shared(final String id);

    IUsedInsightCollectionRequestBuilder used();

    IUsedInsightRequestBuilder used(final String id);

}
