package plugin

import chrome.tabs.ExecuteScriptDetails
import chrome.tabs.QueryInfo
import chrome.tabs.Tab
import org.w3c.dom.HTMLButtonElement
import kotlin.browser.document

fun getCurrentTab(callback: (Tab) -> Unit) {
    chrome.tabs.query(queryInfo = QueryInfo {
        active = true
        currentWindow = true
    }, callback = { callback(it[0]) })
}

fun changeBackgroundColor(tabId: Int, color: String) {
    val script = """document.body.style.backgroundColor="$color";"""
    chrome.tabs.executeScript(tabId = tabId, details = ExecuteScriptDetails { code = script })
}

fun main(args: Array<String>) {
    (document.getElementById("changeColor") as HTMLButtonElement).addEventListener(
        type = "click",
        callback = { getCurrentTab { changeBackgroundColor(it.id!!, "3aa757") } })
}