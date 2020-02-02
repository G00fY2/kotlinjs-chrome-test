@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package chrome.tabs

inline fun QueryInfo(block: QueryInfo.() -> Unit) = (js("{}") as QueryInfo).apply(block)

inline fun ExecuteScriptDetails(block: ExecuteScriptDetails.() -> Unit) =
    (js("{}") as ExecuteScriptDetails).apply(block)