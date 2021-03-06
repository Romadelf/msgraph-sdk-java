// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Protection Options.
 */
public class WorkbookWorksheetProtectionOptions implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Allow Auto Filter.
     * Represents the worksheet protection option of allowing using auto filter feature.
     */
    @SerializedName("allowAutoFilter")
    @Expose
    public Boolean allowAutoFilter;

    /**
     * The Allow Delete Columns.
     * Represents the worksheet protection option of allowing deleting columns.
     */
    @SerializedName("allowDeleteColumns")
    @Expose
    public Boolean allowDeleteColumns;

    /**
     * The Allow Delete Rows.
     * Represents the worksheet protection option of allowing deleting rows.
     */
    @SerializedName("allowDeleteRows")
    @Expose
    public Boolean allowDeleteRows;

    /**
     * The Allow Format Cells.
     * Represents the worksheet protection option of allowing formatting cells.
     */
    @SerializedName("allowFormatCells")
    @Expose
    public Boolean allowFormatCells;

    /**
     * The Allow Format Columns.
     * Represents the worksheet protection option of allowing formatting columns.
     */
    @SerializedName("allowFormatColumns")
    @Expose
    public Boolean allowFormatColumns;

    /**
     * The Allow Format Rows.
     * Represents the worksheet protection option of allowing formatting rows.
     */
    @SerializedName("allowFormatRows")
    @Expose
    public Boolean allowFormatRows;

    /**
     * The Allow Insert Columns.
     * Represents the worksheet protection option of allowing inserting columns.
     */
    @SerializedName("allowInsertColumns")
    @Expose
    public Boolean allowInsertColumns;

    /**
     * The Allow Insert Hyperlinks.
     * Represents the worksheet protection option of allowing inserting hyperlinks.
     */
    @SerializedName("allowInsertHyperlinks")
    @Expose
    public Boolean allowInsertHyperlinks;

    /**
     * The Allow Insert Rows.
     * Represents the worksheet protection option of allowing inserting rows.
     */
    @SerializedName("allowInsertRows")
    @Expose
    public Boolean allowInsertRows;

    /**
     * The Allow Pivot Tables.
     * Represents the worksheet protection option of allowing using pivot table feature.
     */
    @SerializedName("allowPivotTables")
    @Expose
    public Boolean allowPivotTables;

    /**
     * The Allow Sort.
     * Represents the worksheet protection option of allowing using sort feature.
     */
    @SerializedName("allowSort")
    @Expose
    public Boolean allowSort;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
