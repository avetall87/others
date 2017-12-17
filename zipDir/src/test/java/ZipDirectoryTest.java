import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by avetall  17.12.17.
 */
public class ZipDirectoryTest {

    private ZipDirectory zipDirectory;
    private final String dirName = "/home/user/Programming/testZip";


    @BeforeMethod
    public void setUp() throws Exception {
       zipDirectory = new ZipDirectoryImpl(dirName);
    }

    @Test(priority = 3)
    public void testZipDiretory() throws Exception {
        zipDirectory.zipDiretory("test123");
    }

    @Test(priority = 1)
    public void testMakeDirectory() throws Exception {
        assertTrue(zipDirectory.makeDirectory());
    }

    @Test(priority = 4)
    @Ignore
    public void testDeleteDirectory() throws Exception {
        assertTrue(zipDirectory.deleteDirectory());
    }

    @Test(priority = 2)
    public void testMakeFile() throws Exception {
        Map<String,byte[]> data = new HashMap<>();
        String fileData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<ns1:NewMarriageData xmlns:fns=\"urn://x-artefacts-fns-information-marriage/commons/3.0.0\" xmlns:ns1=\"urn://x-artefacts-fns-information-marriage/root/3.0.0\">\n" +
                "    <fns:OutgoingStatementNum>1</fns:OutgoingStatementNum>\n" +
                "    <fns:MarriageApplicantDetails>\n" +
                "        <fns:MarriageState>не состоял в браке</fns:MarriageState>\n" +
                "        <fns:LastNameAfterWedding>Попоопоп</fns:LastNameAfterWedding>\n" +
                "        <fns:ZagsApplicantData>\n" +
                "            <fns:FirstName>Ппопоппоп</fns:FirstName>\n" +
                "            <fns:LastName>Попоопоп</fns:LastName>\n" +
                "            <fns:MiddleName>Опоппопппопоп</fns:MiddleName>\n" +
                "            <fns:BirthDate>1985-01-01+03:00</fns:BirthDate>\n" +
                "            <fns:Sex>1</fns:Sex>\n" +
                "            <fns:AddressRegistration>\n" +
                "                <fns:AddressKLADR>\n" +
                "                    <fns:District>Кировский район</fns:District>\n" +
                "                    <fns:Town>Санкт-Петербург</fns:Town>\n" +
                "                    <fns:Street>Ппоппоппоп ппоппопп</fns:Street>\n" +
                "                    <fns:Home>21</fns:Home>\n" +
                "                    <fns:Building>1</fns:Building>\n" +
                "                    <fns:Flat>10</fns:Flat>\n" +
                "                </fns:AddressKLADR>\n" +
                "                <fns:AddressRFText>Россия, Санкт-Петербург, Кировский район</fns:AddressRFText>\n" +
                "            </fns:AddressRegistration>\n" +
                "            <fns:DocSeries>20 01</fns:DocSeries>\n" +
                "            <fns:DocNumber>122111</fns:DocNumber>\n" +
                "            <fns:DocIssueDate>2006-01-01+03:00</fns:DocIssueDate>\n" +
                "            <fns:DocIssuerName>14 о/м Кировского района Санкт-Петербурга</fns:DocIssuerName>\n" +
                "            <fns:DocType>doc_name</fns:DocType>\n" +
                "            <fns:BirthPlace>\n" +
                "                <fns:PlaceText>РСФСР, Ленинград</fns:PlaceText>\n" +
                "                <fns:PlaceStruct>\n" +
                "                    <fns:CountryName>РСФСР</fns:CountryName>\n" +
                "                    <fns:Town>Ленинград</fns:Town>\n" +
                "                </fns:PlaceStruct>\n" +
                "            </fns:BirthPlace>\n" +
                "            <fns:Citizenship>России</fns:Citizenship>\n" +
                "        </fns:ZagsApplicantData>\n" +
                "        <fns:ZagsPersonInformation>\n" +
                "            <fns:Nationality>русский</fns:Nationality>\n" +
                "            <fns:Education>высшее (профессиональное)</fns:Education>\n" +
                "        </fns:ZagsPersonInformation>\n" +
                "    </fns:MarriageApplicantDetails>\n" +
                "    <fns:MarriageApplicantSecondDetails>\n" +
                "        <fns:MarriageState>не состояла в браке</fns:MarriageState>\n" +
                "        <fns:LastNameAfterWedding>Пьпопо</fns:LastNameAfterWedding>\n" +
                "        <fns:ZagsApplicantSecondData>\n" +
                "            <fns:FirstName>Попьо</fns:FirstName>\n" +
                "            <fns:LastName>Пьпопо</fns:LastName>\n" +
                "            <fns:MiddleName>Опоппооппо</fns:MiddleName>\n" +
                "            <fns:BirthDate>1984-01-01+03:00</fns:BirthDate>\n" +
                "            <fns:Sex>2</fns:Sex>\n" +
                "            <fns:AddressRegistration>\n" +
                "                <fns:AddressKLADR>\n" +
                "                    <fns:District>Красносельский район</fns:District>\n" +
                "                    <fns:Town>Санкт-Петербург</fns:Town>\n" +
                "                    <fns:Street>опопо Поппопоппопо Попьпопопо</fns:Street>\n" +
                "                    <fns:Home>20</fns:Home>\n" +
                "                    <fns:Building>2</fns:Building>\n" +
                "                    <fns:Flat>11</fns:Flat>\n" +
                "                </fns:AddressKLADR>\n" +
                "                <fns:AddressRFText>Россия, Санкт-Петербург, Красносельский район</fns:AddressRFText>\n" +
                "            </fns:AddressRegistration>\n" +
                "            <fns:DocSeries>20 01</fns:DocSeries>\n" +
                "            <fns:DocNumber>121111</fns:DocNumber>\n" +
                "            <fns:DocIssueDate>2006-01-01+03:00</fns:DocIssueDate>\n" +
                "            <fns:DocIssuerName>84 о/м Красносельского района Санкт-Петербурга</fns:DocIssuerName>\n" +
                "            <fns:DocType>Паспорт РФ</fns:DocType>\n" +
                "            <fns:BirthPlace>\n" +
                "                <fns:PlaceText>РСФСР, Ленинград</fns:PlaceText>\n" +
                "                <fns:PlaceStruct>\n" +
                "                    <fns:CountryName>РСФСР</fns:CountryName>\n" +
                "                    <fns:Town>Ленинград</fns:Town>\n" +
                "                </fns:PlaceStruct>\n" +
                "            </fns:BirthPlace>\n" +
                "            <fns:Citizenship>182</fns:Citizenship>\n" +
                "        </fns:ZagsApplicantSecondData>\n" +
                "        <fns:ZagsPersonInformation>\n" +
                "            <fns:Nationality>русская</fns:Nationality>\n" +
                "            <fns:Education>education</fns:Education>\n" +
                "        </fns:ZagsPersonInformation>\n" +
                "    </fns:MarriageApplicantSecondDetails>\n" +
                "    <fns:ZagsOrganizationData>\n" +
                "        <fns:ZagsResidence>пр. Ветеранов, 131</fns:ZagsResidence>\n" +
                "        <fns:ZagsCode>707</fns:ZagsCode>\n" +
                "        <fns:ZagsName>Отдел ЗАГС Красносельского района Комитета по делам ЗАГС Правительства Санкт-Петербурга</fns:ZagsName>\n" +
                "    </fns:ZagsOrganizationData>\n" +
                "</ns1:NewMarriageData>";
        for (int i = 0; i < 5000; i++) {
            data.put("testFile"+i+".xml",fileData.getBytes());
        }
        zipDirectory.makeFile(data);
    }
}