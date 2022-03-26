*** Settings ***
Library           Selenium2Library

*** Variables ***
${Username}       //input[@id='txtUsername']
${password}       //input[@id='txtPassword']
${buttonlogin}    //input[@id='btnLogin']
${logout}         //li[3]/a[.='Logout']
${verify teks login}    //div[@id='logInPanelHeading']
${welcome}        //a[@class='panelTrigger activated-welcome']
${verify welcome}    //a[@id='welcome']
${user management}    //a[.='User Management']
${Menu admin}     //b[.='Admin']
${display welcome}    //div[@id='welcome-menu']
${spanuser}       //div[@id='logInPanelHeading']
${error message}    //span[@id='spanMessage']
${Users}          //a[@id='menu_admin_viewSystemUsers']
${username user}    //input[@id='searchSystemUser_userName']
${button search}    id = searchBtn
${john}           //td[.='John Lenon']
${checkbox}       //td[.='John Lenon']/preceding-sibling::td
${button delete user}    //input[@id='btnDelete']
${button add user}    //input[@id='btnAdd']
${verify teks add user}    //h1[@id='UserHeading']
${button save add user}    //input[@id='btnSave']
${click user role}    //select[@id='systemUser_userType']
${select role add}    //option[.='Admin']
${select status add}    //option[.='Disabled']
${input emp name}    //input[@id='systemUser_employeeName_empName']
${input username}    //input[@id='systemUser_userName']
${input password}    //input[@id='systemUser_password']
${input confirm pas}    //input[@id='systemUser_confirmPassword']
${verify teks confirm pas}    //span[contains(.,'For a strong password, please use a hard to guess combination of text with upper')]
${nationalities}    //a[@id='menu_admin_nationality']
${marketplace}    //input[@id='MP_link']
${verify teks nationalities}    //h1[.='Nationalities']
${all checkbox national}    //input[@type='checkbox']
${corpate branding}    //a[@id='menu_admin_addTheme']
${choose file}    //input[@id='loginBanner']
${AddFile}        ‪C:\Users\ADITYA\Desktop\lebah.jpg
${button save}    //input[@id='btnSave']
${organization}    //a[@id='menu_admin_Organization']
${button add organization}    //input[@id='btnAdd']
${location}       //a[@id='menu_admin_viewLocations']
${verify teks location}    //a[.='>']
${input name}     //input[@id='location_name']
${select country}    //select[@id='location_country']
${input provinsi}    //input[@id='location_province']
${input city}     //input[@id='location_city']
${input addrres}    //textarea[@id='location_address']
${input code}     //input[@id='location_zipCode']
${input phone}    //input[@id='location_phone']
${input fax}      //input[@id='location_fax']
${input notes}    //textarea[@id='location_notes']
${verify teks}    //td[.='Indonesia']
${checkbox joe}    //input[@value='21']
${checkbox nina}    //td[.='Nina.Patel']/preceding-sibling::td

*** Test Cases ***
TCLoginLogout
    [Documentation]    Login
    Open Browser    https://opensource-demo.orangehrmlive.com/    chrome
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Wait Until Element Is Visible    //input[@id='txtUsername']
    Input Text    //input[@id='txtUsername']    Admin
    Wait Until Element Is Visible    //input[@id='btnLogin']
    Input Text    //input[@id='txtPassword']    admin123
    Click Button    //input[@id='btnLogin']
    Wait Until Element Is Visible    //a[@id='welcome']
    Click Element    //a[@id='welcome']
    Wait Until Element Is Visible    //li[3]/a[.='Logout']
    Click Element    //li[3]/a[.='Logout']
    Wait Until Element Is Visible    //div[@id='logInPanelHeading']
    Close Browser

TCLoginPage
    Open Browser    https://opensource-demo.orangehrmlive.com/    chrome
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    #Input Text    //input[@id='txtUsername']    Admin    CARA REMAKS
    #Input Text    //input[@id='txtPassword']    123
    Click Button    //input[@id='btnLogin']
    Get Text    //span[@id='spanMessage']
    Input Text    //input[@id='txtUsername']    Admin
    Click Button    //input[@id='btnLogin']
    Get Text    //span[@id='spanMessage']
    Clear Element Text    //input[@id='txtUsername']
    Sleep    2s
    Input Text    //input[@id='txtPassword']    123
    Click Button    //input[@id='btnLogin']
    Get Text    //span[@id='spanMessage']
    Clear Element Text    //input[@id='txtPassword']
    Sleep    2s
    Input Text    //input[@id='txtUsername']    Admin
    Input Text    //input[@id='txtPassword']    admin123
    Click Button    //input[@id='btnLogin']
    Element Should Be Visible    //a[@id='welcome']    timeout=5
    Close Browser

TCAddDelete
    Open Browser    https://opensource-demo.orangehrmlive.com/    chrome
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Input Text    //input[@id='txtUsername']    Admin
    Input Text    //input[@id='txtPassword']    admin123
    Click Button    //input[@id='btnLogin']
    Element Should Be Visible    //a[@id='welcome']    timeout=5
    Mouse Over    //b[.='Admin']
    Mouse Over    //a[.='User Management']
    Mouse Over    //a[@id='menu_admin_viewSystemUsers']
    Click Element    //a[@id='menu_admin_viewSystemUsers']
    Element Should Be Visible    //input[@id='searchSystemUser_userName']    timeout=5
    Click Element    //input[@id='btnAdd']
    Wait Until Element Is Visible    //h1[@id='UserHeading']
    Click Element    //input[@id='btnSave']
    Input Text    //input[@id='systemUser_employeeName_empName']    john smith
    Input Text    //input[@id='systemUser_userName']    John Lenon
    Input Text    //input[@id='systemUser_password']    P4ruN9p@njanG
    Click Element    id = systemUser_confirmPassword
    Sleep    2s
    Input Text    //input[@id='systemUser_confirmPassword']    P4ruN9p@njanG
    ##Wait Until Element Is Visible    //span[contains(.,'For a strong password, please use a hard to guess combination of text with upper')] 2s
    Click Element    //input[@id='btnSave']
    Scroll Element Into View    //td[.='John Lenon']
    Click Element    //td[.='John Lenon']/preceding-sibling::td
    Scroll Element Into View    //input[@id='btnDelete']
    Click Button    //input[@id='btnDelete']
    Click Button    //input[@id='dialogDeleteBtn']
    ##Input Text    //input[@id='searchSystemUser_userName']    john wick
    ##Click Button    id = searchBtn
    Close Browser

Loop
    Open Browser    https://opensource-demo.orangehrmlive.com/    chrome
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Input Text    //input[@id='txtUsername']    Admin
    Input Text    //input[@id='txtPassword']    admin123
    Click Button    //input[@id='btnLogin']
    Element Should Be Visible    //a[@id='welcome']    timeout=5
    Mouse Over    //b[.='Admin']
    Click Element    //a[@id='menu_admin_nationality']
    Element Should Be Visible    //h1[.='Nationalities']
    ##@{listChekbox}    Get WebElements    //input[@type='checkbox']
    ##FOR    ${i++} IN @{LISTCHEKBOX}
    ##    Exit For Loop If ${i} == 20
    ##END
    ##Log    Exited

TCChooseFile
    Open Browser    https://opensource-demo.orangehrmlive.com/    chrome
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Input Text    //input[@id='txtUsername']    Admin
    Input Text    //input[@id='txtPassword']    admin123
    Click Button    //input[@id='btnLogin']
    Element Should Be Visible    //a[@id='welcome']    timeout=5
    Mouse Over    //b[.='Admin']
    Click Element    //a[@id='menu_admin_addTheme']
    Wait Until Element Is Enabled    //input[@id='loginBanner']    5s
    Choose File    //input[@id='loginBanner']    C:/Users/ADITYA/Desktop/lebah.jpg
    Wait Until Element Is Enabled    //input[@id='btnSave']
    Click Button    //input[@id='btnSave']
    Close Browser

TCSelect
    Open Browser    https://opensource-demo.orangehrmlive.com/    chrome
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Input Text    //input[@id='txtUsername']    Admin
    Input Text    //input[@id='txtPassword']    admin123
    Click Button    //input[@id='btnLogin']
    Element Should Be Visible    //a[@id='welcome']    timeout=5
    Mouse Over    //b[.='Admin']
    Mouse Over    //a[.='User Management']
    Mouse Over    //a[@id='menu_admin_Organization']
    Mouse Over    //a[@id='menu_admin_viewLocations']
    Click Element    //a[@id='menu_admin_viewLocations']
    Wait Until Element Is Enabled    //a[.='>']
    Click Element    //input[@id='btnAdd']
    Input Text    //input[@id='location_name']    roy
    Select From List By Value    //select[@id='location_country']    ID
    Input Text    //input[@id='location_province']    jawa barat
    Input Text    //input[@id='location_city']    bogor
    Input Text    //textarea[@id='location_address']    jl.nangka no.7 RT01/RW05
    Input Text    //input[@id='location_zipCode']    11490
    Input Text    //input[@id='location_phone']    0813897651062
    Input Text    //input[@id='location_fax']    01298651
    Input Text    //textarea[@id='location_notes']    testing
    Click Element    //input[@id='btnSave']
    Wait Until Element Is Enabled    //td[.='Indonesia']
    Close Browser

coba
    Open Browser    https://opensource-demo.orangehrmlive.com/    Chrome
    Wait Until Element Is Visible    //input[@id='txtUsername']    timeout=5
    Input Text    //input[@id='txtUsername']    Admin
    Input Password    //input[@id='txtPassword']    admin123
    Click Button    //input[@id='btnLogin']
    Element Should Be Visible    id:welcome    timeout=5
    @{TestIDs}=    Create List
    FOR    ${element}    IN    @{elementList}
        ${text}=    Get Text    ${element}
        Append To List    ${textList}    ${text}
    END
    Log To Console    \n List from WebPage:
    Log To Console    ${textList}
    Log To Console    Our List:
    Log To Console    ${quickLaunchList}
    Lists Should Be Equal    ${textList}    ${quickLaunchList}
    Close Browser

TCcheckbox
    Open Browser    https://opensource-demo.orangehrmlive.com/    chrome
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Input Text    //input[@id='txtUsername']    Admin
    Input Text    //input[@id='txtPassword']    admin123
    Click Button    //input[@id='btnLogin']
    Element Should Be Visible    //a[@id='welcome']    timeout=5
    Mouse Over    //b[.='Admin']
    Mouse Over    //a[.='User Management']
    Mouse Over    //a[@id='menu_admin_viewSystemUsers']
    Click Element    //a[@id='menu_admin_viewSystemUsers']
    Element Should Be Visible    //input[@id='searchSystemUser_userName']    timeout=5
    Scroll Element Into View    //input[@value='21']
    Page Should Contain Checkbox    //input[@value='21']
    Select Checkbox    //input[@value='21']
    Checkbox Should Be Selected    //input[@value='21']
    Unselect Checkbox    //input[@value='21']
    Checkbox Should Not Be Selected    //input[@value='21']
