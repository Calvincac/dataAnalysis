# Data Analysis

Please read the following for more information about the input file, data analysis and the
needed output. <br>
There are 3 kinds of data inside the file. For each kind of data there is a different layout.<br>
This application must only read from <strong>ONE</strong> file .dat and write the output into another file with extension .done.dat

<h4>Salesman data </h4>
Salesman data has the format id 001 and the line will have the following format.<br>
001çCPFçNameçSalary<br>

<h4>Customer data</h4>
Customer data has the format id 002 and the line will have the following format.<br>
002çCNPJçNameçBusinessArea<br>

<h4>Sales data </h4>
Sales data has the format id 003. Inside the sales row, there is the list of items, which is
wrapped by square brackets []. The line will have the following format. <br>
003çSaleIDç[ItemID-ItemQuantity-ItemPrice]çSalesmanname<br>

<h4>Sample file data</h4>
The following is a sample of the data that the application should be able to read. Note that
this is a sample, real data could be 100% different.  <br>
001ç1234567891234çDiegoç50000  <br>
001ç3245678865434çRenatoç40000.99  <br>
002ç2345675434544345çJosedaSilvaçRural
002ç2345675433444345çEduardoPereiraçRural  <br>
003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çDiego  <br>
003ç08ç[1-34-10,2-33-1.50,3-40-0.10]çRenato  <br>

<h3>Data analysis</h3>
Your system must read data from the default directory, located at /data/in. <br>
The system must only read the .dat file (only one file). <br>
After processing  the file inside the input default directory, the system must create a flat file <br>
inside the default output directory, located at /data/out. <br>
The filename must follow this pattern, {flat_file_name}.done.dat <br>
The output file contents should summarize the following data: <br> <br>
● Amount of clients in the input file <br>
● Amount of salesman in the input file <br>
● ID of the most expensive sale <br>
● Worst salesman ever <br>
