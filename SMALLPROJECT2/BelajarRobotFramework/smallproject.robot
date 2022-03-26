*** Settings ***
Library           Selenium2Library

*** Variables ***
${url}            http://qa.cilsy.id:8080/en/
${browser}        chrome
${linksign}       //span[.='Sign in']
${verify teks authentication}    //h1[.='Authentication']
${buttonCreate}    //span[contains(.,'Create an account')]
${invalid email}    //li[.='Invalid email address.']
${input email page login}    //input[@id='email_create']
${verify teks information}    //h3[.='Your personal information']
${eror create account}    //div[@class='alert alert-danger']
${radio button Mr}    //input[@name='id_gender' and @value='1']
${input first name}    //label[.='First name *']/following-sibling::input
${input last name}    //label[.='Last name *']/following-sibling::input
${input email name}    //label[.='Email *']/following-sibling::input
${input password}    //label[.='Password *']/following-sibling::input
${select tanggal}    //*[@id="days"]
${select bulan}    //*[@id="months"]
${select tahun}    //*[@id="years"]
${checkbox newsletter}    //input[@name='newsletter' and @value='1']
${checkbox receive}    //input[@name='optin' and @value='1']
${button register}    //span[contains(.,'Register')]
${verify teks myaccount}    //p[@class='info-account']
${input email}    id = email
${input password sign}    id = passwd
${button signin}    //button[@id='SubmitLogin']/span[contains(.,'Sign in')]
${dropdown account}    //li[@class='dropdown account_info_cont']
${button logout}    //a[.='Logout']
${eror signin}    //p[.='There is 1 error']
${forgot password}    //a[.='Forgot your password?']
${retreive password}    //span[contains(.,'Retrieve Password')]
${button first address}    //span[.='Add my first address']
${verify teks address}    //h1[.='Your addresses']
${button save in address}    //span[contains(.,'Save')]
${input firstname address}    //label[.='First name *']/following-sibling::input
${input lastname address}    //label[.='Last name *']/following-sibling::input
${input company}    //label[.='Company']/following-sibling::input
${input VAT number}    //label[.='VAT number']/following-sibling::input
${input address}    //label[.='Address *']/following-sibling::input
${input address2}    //label[.='Address (Line 2)']/following-sibling::input
${input postal code}    //label[.='Zip/Postal Code *']/following-sibling::input
${input city}     //label[.='City *']/following-sibling::input
${select state}    //*[@id="id_state"]
${select country}    //*[@id="id_country"]
${input home phone}    //label[.='Home phone **']/following-sibling::input
${input mobile phone}    //label[.='Mobile phone **']/following-sibling::input
${input additional information}    //label[.='Additional information']/following-sibling::textarea
${input future reference}    //label[.='Please assign an address title for future reference. *']/following-sibling::input
${verify teks myaddress}    //h1[.='My addresses']
${button add a new addr}    //span[.='Add a new address']
${button delete addr}    //span[.='Delete']
${button home addr}    //span[.=' Home']
${picture}        //img[@alt='Delux Rooms']
${book now1}      //*[@id="hotelRoomsBlock"]/div/div[2]/div/div[1]/div[1]/div/div[3]/a
${verify teks the hotel}    //div[@class='col-sm-12 search_result_info']
${tab window}     Delux Rooms - Sekolah QA
${book now}       //span[contains(.,'Book Now')]
${verify teks room succes}    //h2[contains(.,'Room successfully added to your cart')]
${button proses bayar}    //span[contains(.,'Proceed to checkout')]
${verify teks room information}    //span[.='Rooms & Price Summary']
${button procced}    //div[@class='col-sm-12 proceed_btn_block']/a[contains(.,'Proceed')]
${verify teks guest information}    //span[.='Guest Information']
${button procced guest}    //div[@id='collapse-guest-info']//span[contains(.,'Proceed')]
${checkbox I agree}    id = cgv
${pay by bank wire}    //span[.='(order processing will be longer)']
${verify teks order summary}    //h1[contains(.,'Order summary')]
${button confirm order}    //span[contains(.,'I confirm my order')]
${verify teks order succes}    //h1['Order confirmation']
${button confirm order}    //span[contains(.,'I confirm my order')]
${button search hotel}    //span[.='Search Now']
${button search rooms}    //span[.='Search Rooms']
${verify outline}    //div[@class='row header-rmsearch-inner-wrapper']
${select hotel}    //button[@id='id_hotel_button']
${hotel prime}    //li[@class='search_result_li']
${select in date}    //input[@id='check_in_time']
${select date}    //a[.='20']
${select out date}    //input[@id='check_out_time']
${select next date}    //a[.='25']
${checkbox 5}     //div[@id='filter_results']//div[@class='col-sm-12 lf_sub_cont']/div[1]//input[@value='5']
${checkbox 4}     //div[@class='col-sm-12 lf_sub_cont']/div[2]//input[@value='4']
${checkbox 3}     //div[@class='col-sm-12']/div[1]//input[@value='3']
${checkbox 2}     //div[@id='filter_results']//div[4]//input[@value='2']
${checkbox 1}     //div[@id='filter_results']//div[5]//input[@value='1']
${checkbox 0}     //div[@id='filter_results']//input[@value='0']
${checkbox wifi}    //div[@class='col-sm-12 lf_sub_cont']/div[1]//input[@value='1']
${checkbox news paper}    //div[@class='col-sm-12 lf_sub_cont']/div[2]//input[@value='2']
${checkbox backup}    //div[@class='col-sm-12']/div[2]//input[@value='3']
${checkbox refrigator}    //div[@id='filter_results']//div[4]//input[@value='4']
${checkbox restaurant}    //div[@id='filter_results']//div[5]//input[@value='5']
${checkbox room service}    //div[@id='filter_results']//input[@value='6']
${checkbox gym}    //input[@value='7']
${clear filter}    //div[@id='filter_results']//div[2]//span[@class='pull-right clear_filter']
${verify teks search room}    //p[.='Search Rooms']
${sortby rating}    //span[.='Rating']
${sortby rating desc}    //a[.='Rating Descending']
${sortby price}    //button[@id='price_ftr']
${sortby price high to low}    //a[contains(.,'Price : Highest first')]
${verify teks luxury room}    //p[.='luxury Rooms']
${button menu}    //button[@class='nav_toggle']
${contact}        //a[.='Contact']
${verify teks contact}    //p[.='Contact Us']
${choose subject}    //button[@class='form-control contact_type_input']
${customer service}    //li[contains(.,'Customer service')]
${message}        //textarea[@id='message']
${choose file}    //input[@id='fileUpload']
${button send message}    //span[.='Send Message']
${verify teks succes message}    //p[@class='alert alert-success']
${home}           //a[.='Home']
${interior}       //a[.='Interior']
${amenities}      //a[.='Amenities']
${rooms}          //a[.='Rooms']
${testimoni}      //a[.='Testimonials']
${privasi & hukum}    //li[6]/a[.='Kebijakan privasi dan hukum']
${tentang kami}    //li[7]/a[.='Tentang kami']
${verify teks hotel dominic}    //h1[.='Hotel Dominic Parks']
${verify teks interior}    //p[.='Interior']
${verify teks amenities}    //p[.='Amenities']
${verify teks our room}    //p[.='Our Rooms']
${verify teks testimoni}    //p[.='What our Guest say?']
${verify teks privasi & hukum}    //h2[.='Kebijakan privasi dan hukum']
${verify teks tentang kami}    //h2[.='Tentang kami']
${copyright}      //p[@class='copyRight']
${language}       //p[.='Language']
${language eng}    //div[@class='current']/span[.='English']
${language indo}    //span[.='Indonesia']
${input subcribe}    //input[@id='newsletter-input']
${button subcribe}    //span[.='Subscribe']
${verify teks neswletter}    //p[@class='alert alert-danger']
${teks hotel policies}    //span[.='Hotel Policies']
${refund policies}    //a[.='Refund policies']
${review}         //*[@id="center_column"]/div/div/div[1]/div[2]/section/ul/li[3]/a
${input firstname guest}    id = customer_firstname
${input lastname guest}    id = customer_lastname
${input phone guest}    id = phone_mobile
${button save}    //span[.='Save']
${menu account}    id = user_info_acc
${account}        //a[.='Accounts']
${my addres account}    //span[.='My addresses']
${my personal info}    //span[.='My personal information']
${current pass}    id = old_passwd
${new pass}       id = passwd
${confirm}        id = confirmation
${verify teks succes update pass}    //p[@class='alert alert-success']
${button home my account}    //span[contains(.,'Home')]
${link img LO}    //img[@alt='Sekolah QA']
${button paypal}    //a[contains(.,'Pay with your card or your PayPal account')]
${verify teks error paypal}    //h2[.='Error occurred:']
${location}       id = hotel_location
${verify teks myaddres add}    //h3[.='My address']
${verify teks executive room}    //p[.='Executive Rooms']

*** Test Cases ***
C1&C4&C10
    Open Browser    ${url}    ${browser}
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Click Element    ${linksign}
    Wait Until Element Is Visible    ${verify teks authentication}
    Click Element    ${buttonCreate}
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/tidak valid alamat email.png
    Input Text    ${input email page login}    wijaya@mailnesia.com
    Click Element    ${buttonCreate}
    Clear Element Text    ${input email page login}
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/alamat email sudah ada.png
    Close Browser

C2&C3
    Open Browser    ${url}    ${browser}
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Click Element    ${linksign}
    Wait Until Element Is Visible    ${verify teks authentication}
    Input Text    ${input email page login}    johan@mailnesia.com
    Click Element    ${buttonCreate}
    Wait Until Element Is Visible    ${verify teks information}
    Click Element    ${button register}
    Page Should Contain Radio Button    ${radio button Mr}
    Select Radio Button    id_gender    1
    Radio Button Should Be Set To    id_gender    1
    Input Text    ${input first name}    indra
    Input Text    ${input last name}    bakti
    Input Text    ${input password}    qwerty
    Page Should Contain List    ${select tanggal}
    Select From List By Value    ${select tanggal}    5
    Page Should Contain List    ${select bulan}
    Select From List By Value    ${select bulan}    12
    Page Should Contain List    ${select tahun}
    Select From List By Value    ${select tahun}    1900
    #Page Should Contain Checkbox    ${checkbox newsletter}
    #Select Checkbox    newsletter
    Select Checkbox    newsletter
    Select Checkbox    optin
    Unselect Checkbox    newsletter
    Unselect Checkbox    optin
    Click Element    ${button register}
    Wait Until Element Is Visible    ${verify teks myaccount}
    Click Element    ${dropdown account}
    Click Element    ${button logout}
    Wait Until Element Is Visible    ${verify teks authentication}
    Input Text    ${input email}    johan@mailnesia.com
    Input Text    ${input password sign}    qwerty
    Click Element    ${button signin}
    Wait Until Element Is Visible    ${verify teks myaccount}
    Close Browser

C5& C12
    Open Browser    ${url}    ${browser}
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Sleep    2s
    Click Element    ${linksign}
    Wait Until Element Is Visible    ${verify teks authentication}
    Click Element    ${button signin}
    Wait Until Element Is Visible    ${eror signin}
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/email diperlukan.png
    Input Text    ${input email}    johan@mailnesia.com
    Click Element    ${button signin}
    Wait Until Element Is Visible    ${eror signin}
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/password diperlukan.png
    Clear Element Text    ${input email}
    Input Text    ${input password sign}    qwerty
    Click Element    ${button signin}
    Wait Until Element Is Visible    ${eror signin}
    Capture Page Screenshot
    Clear Element Text    ${input password sign}
    Input Text    ${input email}    johan@mailnesia.com
    Input Text    ${input password sign}    qwerty
    Click Element    ${button signin}
    Wait Until Element Is Visible    ${verify teks myaccount}
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/myaccount.png
    Click Element    ${dropdown account}
    Click Element    ${button logout}
    Close Browser

C6 B
    Open Browser    http://qa.cilsy.id:8080/en/    chrome
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Sleep    2s
    Click Element    ${linksign}
    Click Element    ${forgot password}
    Click Element    ${retreive password}
    Wait Until Element Is Visible    ${eror signin}
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/tidak ada email.png
    Input Text    ${input email}    wijaya@mailnesia.com
    Click Element    ${retreive password}
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/error saat mengirim email.png
    Element Text Should Be    ${eror signin}    Succes
    Close Browser

C8
    Open Browser    ${url}    ${browser}
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Click Element    ${linksign}
    Input Text    ${input email}    johan@mailnesia.com
    Input Text    ${input password sign}    qwerty
    Click Element    ${button signin}
    Wait Until Element Is Visible    ${verify teks myaccount}
    Click Element    ${my personal info}
    Input Text    id = old_passwd    qwerty
    Input Text    id = passwd    zxcvbnm
    Input Text    id = confirmation    zxcvbnm
    Click Element    ${button save}
    Wait Until Element Is Visible    ${verify teks succes update pass}
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/change pass succes.png
    Click Element    ${button home my account}
    Click Element    ${dropdown account}
    Click Element    ${button logout}
    Click Element    ${linksign}
    Input Text    ${input email}    johan@mailnesia.com
    Input Text    ${input password sign}    zxcvbnm
    Click Element    ${button signin}
    Wait Until Element Is Visible    ${verify teks myaccount}
    Close Browser

C9
    Open Browser    ${url}    ${browser}
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Click Element    ${linksign}
    Wait Until Element Is Visible    ${verify teks authentication}
    Input Text    ${input email}    roy@mailnesia.com
    Input Text    ${input password sign}    qwerty
    Click Element    ${button signin}
    Wait Until Element Is Visible    ${verify teks myaccount}
    Click Element    ${button first address}
    Clear Element Text    ${input firstname address}
    Clear Element Text    ${input lastname address}
    Input Text    ${input firstname address}    roy
    Input Text    ${input lastname address}    marten
    Input Text    ${input company}    Kujaya
    Input Text    ${input VAT number}    93.057.598.0-000.000
    Input Text    ${input address}    Jl.Nangka 3 RT02/RW10
    Input Text    ${input address2}    Jl.Nangka 3 RT02/RW10
    Input Text    ${input postal code}    11223
    Input Text    ${input city}    kebon jeruk
    Page Should Contain List    ${select state}
    Select From List By Value    ${select state}    245
    Input Text    ${input home phone}    02159810141
    Input Text    ${input mobile phone}    081365185429
    Input Text    ${input additional information}    patokannya deket SD terbuka
    Input Text    ${input future reference}    Perumahan Perumnas
    Click Element    ${button save in address}
    Wait Until Element Is Visible    ${verify teks myaddress}
    Click Element    ${button add a new addr}
    Wait Until Element Is Visible    ${verify teks address}
    Clear Element Text    ${input firstname address}
    Clear Element Text    ${input lastname address}
    Input Text    ${input firstname address}    woko
    Input Text    ${input lastname address}    purnama
    Input Text    ${input company}    Kujaya
    Input Text    ${input VAT number}    93.057.598.0-000.000
    Input Text    ${input address}    Jl.semangka    RT10/RW03
    Input Text    ${input address2}    Jl.semangka    RT10/RW03
    Input Text    ${input postal code}    11223
    Input Text    ${input city}    rawa kalong
    Page Should Contain List    ${select state}
    Select From List By Value    ${select state}    245
    Input Text    ${input home phone}    02159810141
    Input Text    ${input mobile phone}    081865185760
    Click Element    ${button save in address}
    Wait Until Element Is Visible    ${verify teks myaddress}
    Click Element    ${button delete addr}
    Sleep    2s
    Handle Alert    ACCEPT    timeout=5s
    Wait Until Element Is Visible    ${verify teks myaddress}
    Capture Page Screenshot
    Close Browser

C14 C16 ,C17
    Open Browser    ${url}    ${browser}
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Scroll Element Into View    ${copyright}
    #Sleep    2s
    Click Element    ${language eng}
    Mouse Down    ${language indo}
    Click Element    ${language indo}
    Click Element    ${button menu}
    Click Element    ${home}
    Wait Until Element Is Visible    ${verify teks hotel dominic}
    Click Element    ${button menu}
    Click Element    ${interior}
    Wait Until Element Is Visible    ${verify teks interior}
    Click Element    ${amenities}
    Wait Until Element Is Visible    ${verify teks amenities}
    Click Element    ${rooms}
    Wait Until Element Is Visible    ${verify teks our room}
    Click Element    ${testimoni}
    Wait Until Element Is Visible    ${verify teks testimoni}
    Click Element    ${privasi & hukum}
    Wait Until Element Is Visible    ${verify teks privasi & hukum}
    Click Element    ${button menu}
    Click Element    ${tentang kami}
    Wait Until Element Is Visible    ${verify teks tentang kami}
    Click Element    ${button menu}
    Click Element    ${contact}
    Wait Until Element Is Visible    ${verify teks contact}
    Scroll Element Into View    ${copyright}
    Input Text    ${input subcribe}    rr@mailnesia.com
    Click Element    ${button subcribe}
    Sleep    1s
    Wait Until Element Is Visible    //p[.=' Newsletter : Berlangganan berhasil']
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/upload succes.png
    Close Browser

C15
    Open Browser    ${url}    ${browser}
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Click Element    ${button menu}
    Click Element    ${contact}
    Wait Until Element Is Visible    ${verify teks contact}
    Click Element    ${button send message}
    Wait Until Element Is Visible    ${eror signin}
    #Input Text    ${message}    fasilitas
    #Click Element    ${button send message}
    #Wait Until Element Is Visible    ${verify teks contact}
    Click Element    ${choose subject}
    Mouse Down    ${customer service}
    Click Element    ${customer service}
    Input Text    ${input email}    hanan@mailnesia.com
    Input Text    ${message}    AC nya kurang dingin
    Scroll Element Into View    ${button send message}
    Sleep    2s
    Choose File    ${choose file}    C:/Users/ADITYA/Desktop/lebah.jpg
    Click Element    ${button send message}
    Wait Until Element Is Visible    ${verify teks succes message}
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/upload succes.png
    Close Browser

C18 B
    Open Browser    ${url}    ${browser}
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Click Element    ${button search hotel}
    Wait Until Element Is Visible    ${verify outline}
    Capture Page Screenshot
    Input Text    ${location}    bandung
    Click ELement    ${select hotel}
    Mouse Down    ${hotel prime}
    Click Element    ${hotel prime}
    Click Element    ${select in date}
    Click Element    ${select date}
    Click Element    ${select out date}
    Click Element    ${select next date}
    Click Element    ${button search hotel}
    Wait Until Element Is Visible    ${verify teks search room}
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/input bandung munculnya aceh.png
    Element Text Should Be    ${location}    bandung
    Close Browser

C20
    Open Browser    ${url}    ${browser}
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Click ELement    ${select hotel}
    Mouse Down    ${hotel prime}
    Click Element    ${hotel prime}
    Click Element    ${select in date}
    Click Element    ${select date}
    Click Element    ${select out date}
    Click Element    ${select next date}
    Click Element    ${button search hotel}
    Wait Until Element Is Visible    ${verify teks search room}
    Select Checkbox    ${checkbox 5}
    Select Checkbox    ${checkbox 4}
    Select Checkbox    ${checkbox 3}
    Select Checkbox    ${checkbox 2}
    Select Checkbox    ${checkbox 1}
    Select Checkbox    ${checkbox 0}
    Unselect Checkbox    ${checkbox 5}
    Unselect Checkbox    ${checkbox 4}
    Unselect Checkbox    ${checkbox 3}
    Unselect Checkbox    ${checkbox 2}
    Unselect Checkbox    ${checkbox 1}
    Select Checkbox    ${checkbox wifi}
    Select Checkbox    ${checkbox news paper}
    Select Checkbox    ${checkbox backup}
    Select Checkbox    ${checkbox refrigator}
    Select Checkbox    ${checkbox restaurant}
    Select Checkbox    ${checkbox room service}
    Select Checkbox    ${checkbox gym}
    Click Element    ${clear filter}
    Click Element    ${sortby rating}
    Mouse Down    ${sortby rating desc}
    Click Element    ${sortby rating desc}
    Click Element    ${sortby price}
    Sleep    1s
    Mouse Down    ${sortby price high to low}
    Click Element    ${sortby price high to low}
    Wait Until Element Is Visible    ${verify teks executive room}
    Close Browser

C21
    Open Browser    ${url}    ${browser}
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Click Element    ${linksign}
    Wait Until Element Is Visible    ${verify teks authentication}
    Input Text    ${input email}    johan@mailnesia.com
    Input Text    ${input password sign}    zxcvbnm
    Click Element    ${button signin}
    Wait Until Element Is Visible    ${verify teks myaccount}
    Click Element    ${button home addr}
    Scroll Element Into View    ${picture}
    Click Element    ${book now1}
    Select Window    title=Delux Rooms - Sekolah QA
    Wait Until Element Is Visible    ${verify teks the hotel}
    Click Element    ${book now}
    Wait Until Element Is Visible    ${verify teks room succes}
    Click Element    ${button proses bayar}
    Wait Until Element Is Visible    ${verify teks room information}
    Click Element    ${button procced}
    Wait Until Element Is Visible    ${verify teks guest information}
    Click Element    ${button procced guest}
    Select Checkbox    cgv
    Wait Until Element Is Visible    ${verify teks guest information}
    Click Element    ${pay by bank wire}
    Wait Until Element Is Visible    ${verify teks order summary}
    Click Element    ${button confirm order}
    Wait Until Element Is Visible    ${verify teks order succes}
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/order succes.png
    Close Browser

C22 B
    Open Browser    ${url}    ${browser}
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Click Element    ${linksign}
    Input Text    ${input email}    wijaya@mailnesia.com
    Input Text    ${input password sign}    qwerty
    Click Element    ${button signin}
    Wait Until Element Is Visible    ${verify teks myaccount}
    Click Image    ${link img LO}
    Scroll Element Into View    ${picture}
    Click Element    ${book now1}
    Select Window    title=Delux Rooms - Sekolah QA
    Wait Until Element Is Visible    ${verify teks the hotel}
    Click Element    ${book now}
    Wait Until Element Is Visible    ${verify teks room succes}
    Click Element    ${button proses bayar}
    Wait Until Element Is Visible    ${verify teks room information}
    Click Element    ${button procced}
    Wait Until Element Is Visible    ${verify teks guest information}
    Click Element    ${button procced guest}
    Select Checkbox    cgv
    Wait Until Element Is Visible    ${verify teks guest information}
    Click Element    ${button paypal}
    Wait Until Element Is Visible    ${verify teks error paypal}
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/paypol eror.png
    Element Text Should Be    ${verify teks error paypal}    payment succes
    Close Browser

C23 B
    Open Browser    ${url}    ${browser}
    Set Selenium speed    0.3
    Reload Page
    Maximize Browser Window
    Scroll Element Into View    ${picture}
    Click Element    ${book now1}
    Select Window    title=Delux Rooms - Sekolah QA
    Wait Until Element Is Visible    ${verify teks the hotel}
    Click Element    ${book now}
    Wait Until Element Is Visible    ${verify teks room succes}
    Click Element    ${button proses bayar}
    Wait Until Element Is Visible    ${verify teks room information}
    Click Element    ${button procced}
    Wait Until Element Is Visible    ${verify teks guest information}
    Click Element    ${button save}
    Input Text    ${input firstname guest}    ahmad
    Input Text    ${input lastname guest}    hanan
    Input Text    ${input email}    woko@mailnesia.com
    Input Text    ${input password sign}    qwerty
    Input Text    ${input phone guest}    081510761532
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/before order addr.png
    Click Element    ${button save}
    Wait Until Element Is Visible    ${verify teks guest information}
    Click Element    ${menu account}
    Click Element    ${account}
    Wait Until Element Is Visible    ${verify teks myaccount}
    Click Element    ${my addres account}
    Capture Page Screenshot    D:/polder w/SEKOLAHQA/SMALLPROJECT2/capture/after order addr.png
    Element Text Should Be    ${verify teks myaddres add}    address not found
    Close Browser
