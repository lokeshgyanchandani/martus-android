/*

The Martus(tm) free, social justice documentation and
monitoring software. Copyright (C) 2005-2007, Beneficent
Technology, Inc. (The Benetech Initiative).

Martus is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either
version 2 of the License, or (at your option) any later
version with the additions and exceptions described in the
accompanying Martus license file entitled "license.txt".

It is distributed WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, including warranties of fitness of purpose or
merchantability.  See the accompanying Martus License and
GPL license for more details on the required license terms
for this software.

You should have received a copy of the GNU General Public
License along with this program; if not, write to the Free
Software Foundation, Inc., 59 Temple Place - Suite 330,
Boston, MA 02111-1307, USA.

*/
package org.martus.common.test;
import org.martus.common.fieldspec.FieldSpec;
import org.martus.common.fieldspec.MessageFieldSpec;
import org.martus.util.TestCaseEnhanced;


public class TestMessageFieldSpec extends TestCaseEnhanced
{

	public TestMessageFieldSpec(String name)
	{
		super(name);
	}
	
	public void testBasics() throws Exception
	{
		FieldSpec.XmlFieldSpecLoader loader = new FieldSpec.XmlFieldSpecLoader();
		loader.parse(SAMPLE_MESSAGE_FIELD_XML);
		MessageFieldSpec spec = (MessageFieldSpec)loader.getFieldSpec();
		assertEquals(SAMPLE_MESSAGE_FIELD_XML, spec.toString());
		assertEquals(USER_MESSAGE, spec.getMessage());
		assertEquals(USER_LABEL, spec.getLabel());
	}

	public static final String USER_MESSAGE = "Message to the User";
	public static final String USER_LABEL = "Information";
	public static final String SAMPLE_MESSAGE_FIELD_XML = 
		    "<Field type='MESSAGE'>\n" +
			"<Tag>custom</Tag>\n" +
			"<Label>"+USER_LABEL+"</Label>\n" +
			"<Message>"+USER_MESSAGE+"</Message>\n" +
			"</Field>\n";
}
