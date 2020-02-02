@file:JsQualifier("chrome.tabs")

package chrome.tabs

external fun query(queryInfo: QueryInfo, callback: (Array<Tab>) -> Unit)

external fun executeScript(
    tabId: Int? = definedExternally,
    details: ExecuteScriptDetails,
    callback: ((Array<dynamic>) -> Unit)? = definedExternally
)

external interface QueryInfo {
    var active: Boolean?
    var currentWindow: Boolean?
}

external interface Tab {
    var id: Int?
}

external interface ExecuteScriptDetails {
    var code: String?
}
