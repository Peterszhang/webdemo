<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
 <head>
 <title></title>
 </head>
    <body>
<table border="1">
 *    <thead>
 *       <tr>
 *          <td>Attribute</td>
 *          <td>Theme</td>
 *          <td>Data Types</td>
 *          <td>Description</td>
 *       </tr>
 *    </thead>
 *    <tbody>
 *       <tr>
 *          <td>templateDir</td>
 *          <td>n/a</td>
 *          <td>String</td>
 *          <td>define the template directory</td>
 *       </tr>
 *       <tr>
 *          <td>theme</td>
 *          <td>n/a</td>
 *          <td>String</td>
 *          <td>define the theme name</td>
 *       </tr>
 *       <tr>
 *          <td>template</td>
 *          <td>n/a</td>
 *          <td>String</td>
 *          <td>define the template name</td>
 *       </tr>
 *    </tbody>
 * </table>
 *
 * <!-- END SNIPPET: templateRelatedAttributes -->
 *
 * <p/>
 *
 * <!-- START SNIPPET: generalAttributes -->
 *
 * <table border="1">
 *    <thead>
 *       <tr>
 *          <td>Attribute</td>
 *          <td>Theme</td>
 *          <td>Data Types</td>
 *          <td>Description</td>
 *       </tr>
 *    </thead>
 *    <tbody>
 *       <tr>
 *          <td>cssClass</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>define html class attribute</td>
 *       </tr>
 *       <tr>
 *          <td>cssStyle</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>define html style attribute</td>
 *       </tr>
 *       <tr>
 *          <td>title</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>define html title attribute</td>
 *       </tr>
 *       <tr>
 *          <td>disabled</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>define html disabled attribute</td>
 *       </tr>
 *       <tr>
 *          <td>label</td>
 *          <td>xhtml</td>
 *          <td>String</td>
 *          <td>define label of form element</td>
 *       </tr>
 *       <tr>
 *          <td>labelPosition</td>
 *          <td>xhtml</td>
 *          <td>String</td>
 *          <td>define label position of form element (top/left), default to left</td>
 *       </tr>
 *       <tr>
 *          <td>requiredposition</td>
 *          <td>xhtml</td>
 *          <td>String</td>
 *          <td>define required label position of form element (left/right), default to right</td>
 *       </tr>
 *       <tr>
 *          <td>name</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>Form Element's field name mapping</td>
 *       </tr>
 *       <tr>
 *          <td>required</td>
 *          <td>xhtml</td>
 *          <td>Boolean</td>
 *          <td>add * to label (true to add false otherwise)</td>
 *       </tr>
 *       <tr>
 *          <td>tabIndex</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>define html tabindex attribute</td>
 *       </tr>
 *       <tr>
 *          <td>value</td>
 *          <td>simple</td>
 *          <td>Object</td>
 *          <td>define value of form element</td>
 *       </tr>
 *    </tbody>
 * </table>
 *
 * <!-- END SNIPPET: generalAttributes -->
 *
 * <p/>
 *
 * <!-- START SNIPPET: javascriptRelatedAttributes -->
 *
 * <table border="1">
 *    <thead>
 *       <tr>
 *          <td>Attribute</td>
 *          <td>Theme</td>
 *          <td>Data Types</td>
 *          <td>Description</td>
 *       </tr>
 *    </thead>
 *    <tbody>
 *       <tr>
 *          <td>onclick</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>html javascript onclick attribute</td>
 *       </tr>
 *       <tr>
 *          <td>ondbclick</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>html javascript ondbclick attribute</td>
 *       </tr>
 *       <tr>
 *          <td>onmousedown</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>html javascript onmousedown attribute</td>
 *       </tr>
 *       <tr>
 *          <td>onmouseup</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>html javascript onmouseup attribute</td>
 *       </tr>
 *       <tr>
 *          <td>onmouseover</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>html javascript onmouseover attribute</td>
 *       </tr>
 *       <tr>
 *          <td>onmouseout</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>html javascript onmouseout attribute</td>
 *       </tr>
 *       <tr>
 *          <td>onfocus</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>html javascript onfocus attribute</td>
 *       </tr>
 *       <tr>
 *          <td>onblur</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>html javascript onblur attribute</td>
 *       </tr>
 *       <tr>
 *          <td>onkeypress</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>html javascript onkeypress attribute</td>
 *       </tr>
 *       <tr>
 *          <td>onkeyup</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>html javascript onkeyup attribute</td>
 *       </tr>
 *       <tr>
 *          <td>onkeydown</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>html javascript onkeydown attribute</td>
 *       </tr>
 *       <tr>
 *          <td>onselect</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>html javascript onselect attribute</td>
 *       </tr>
 *       <tr>
 *          <td>onchange</td>
 *          <td>simple</td>
 *          <td>String</td>
 *          <td>html javascript onchange attribute</td>
 *       </tr>
 *    </tbody>
 * </table>
 *
 * <!-- END SNIPPET: javascriptRelatedAttributes -->
 *
 * <p/>
 *
 * <!-- START SNIPPET: tooltipattributes -->
 *
 * <table border="1">
 *  <tr>
 *     <td>Attribute</td>
 *     <td>Data Type</td>
 *     <td>Default</td>
 *     <td>Description</td>
 *  </tr>
 *  <tr>
 *      <td>tooltip</td>
 *      <td>String</td>
 *      <td>none</td>
 *      <td>Set the tooltip of this particular component</td>
 *  </tr>
 *  <tr>
 *      <td>jsTooltipEnabled</td>
 *      <td>String</td>
 *      <td>false</td>
 *      <td>Enable js tooltip rendering</td>
 *  </tr>
 *    <tr>
 *      <td>tooltipIcon</td>
 *      <td>String</td>
 *      <td>/struts/static/tooltip/tooltip.gif</td>
 *      <td>The url to the tooltip icon</td>
 *   <tr>
 *      <td>tooltipDelay</td>
 *      <td>String</td>
 *      <td>500</td>
 *      <td>Tooltip shows up after the specified timeout (miliseconds). A behavior similar to that of OS based tooltips.</td>
 *   </tr>
 *   <tr>
 *      <td>key</td>
 *      <td>simple</td>
 *      <td>String</td>
 *      <td>The name of the property this input field represents.  This will auto populate the name, label, and value</td>
 *   </tr>
 * </table>
 
 &lt;!-- Example 1: --&gt;
 * &lt;s:form
 *          tooltipConfig="#{'tooltipDelay':'500',
 *                           'tooltipIcon='/myImages/myIcon.gif'}" .... &gt;
 *   ....
 *     &lt;s:textfield label="Customer Name" tooltip="Enter the customer name" .... /&gt;
 *   ....
 * &lt;/s:form&gt;
 *
 * &lt;!-- Example 2: --&gt;
 * &lt;s:form
 *         tooltipConfig="#{'tooltipDelay':'500',
 *                          'tooltipIcon':'/myImages/myIcon.gif'}" ... &gt;
 *   ....
 *     &lt;s:textfield label="Address"
 *          tooltip="Enter your address"
 *          tooltipConfig="#{'tooltipDelay':'5000'}" /&gt;
 *   ....
 * &lt;/s:form&gt;
 *
 *
 * &lt;-- Example 3: --&gt;
 * &lt;s:textfield
 *        label="Customer Name"
 *        tooltip="One of our customer Details'"&gt;
 *        &lt;s:param name="tooltipConfig"&gt;
 *             tooltipDelay = 500 |
 *             tooltipIcon = /myImages/myIcon.gif
 *        &lt;/s:param&gt;
 * &lt;/s:textfield&gt;
 *
 *
 * &lt;-- Example 4: --&gt;
 * &lt;s:textfield
 *          label="Customer Address"
 *          tooltip="Enter The Customer Address" &gt;
 *          &lt;s:param
 *              name="tooltipConfig"
 *              value="#{'tooltipDelay':'500',
 *                       'tooltipIcon':'/myImages/myIcon.gif'}" /&gt;
 * &lt;/s:textfield&gt;
 *
 *
 * &lt;-- Example 5: --&gt;
 * &lt;s:textfield
 *          label="Customer Telephone Number"
 *          tooltip="Enter customer Telephone Number"
 *          tooltipConfig="#{'tooltipDelay':'500',
 *                           'tooltipIcon':'/myImages/myIcon.gif'}" /&gt;
    </body> 
  </html> 