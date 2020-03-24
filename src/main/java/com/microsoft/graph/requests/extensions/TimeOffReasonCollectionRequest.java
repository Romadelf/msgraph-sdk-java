// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Off Reason Collection Request.
 */
public class TimeOffReasonCollectionRequest extends BaseCollectionRequest<TimeOffReasonCollectionResponse, ITimeOffReasonCollectionPage> implements ITimeOffReasonCollectionRequest {

    /**
     * The request builder for this collection of TimeOffReason
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TimeOffReasonCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, TimeOffReasonCollectionResponse.class, ITimeOffReasonCollectionPage.class);
    }

    public void get(final ICallback<ITimeOffReasonCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ITimeOffReasonCollectionPage get() throws ClientException {
        final TimeOffReasonCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TimeOffReason newTimeOffReason, final ICallback<TimeOffReason> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TimeOffReasonRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTimeOffReason, callback);
    }

    public TimeOffReason post(final TimeOffReason newTimeOffReason) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TimeOffReasonRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTimeOffReason);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITimeOffReasonCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (TimeOffReasonCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITimeOffReasonCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (TimeOffReasonCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITimeOffReasonCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (TimeOffReasonCollectionRequest)this;
    }

    public ITimeOffReasonCollectionPage buildFromResponse(final TimeOffReasonCollectionResponse response) {
        final ITimeOffReasonCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TimeOffReasonCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TimeOffReasonCollectionPage page = new TimeOffReasonCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}