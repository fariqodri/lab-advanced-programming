class Form:
   __type = ""
   __input = ""
   __button = ""

   def __init__(self, type, input, button):
      self.__type = type
      self.__input = input
      self.__button = button

   def getType(self):
      return self.__type.getType()

   def getInput(self):
      return self.__input.getInput()

   def getButton(self):
      return self.__button.getButton()

class InquiryType:
   __type = ""

   def __init__(self):
      self.__type = "inquiry"

   def getType(self):
      return self.__type

class InquiryInput:
   __input = ""

   def __init__(self):
      self.__input = "query"

   def getInput(self):
      return self.__input

class InquiryButton:
   __button = ""

   def __init__(self):
      self.__button = "search"
	
   def getButton(self):
      return self.__button

### Mandatory checklist no 2 ###
#def create_form(factory):
#    form = factory.create_form()
#    fType = factory.create_type()
#    fInput = factory.create_input()
#    fButton = factory.create_button()
#    form.set(fType, fInput, fButton)
#    return form

### Mandatory checklist no 3 ###
#def create_form(builder):
#    builder.create_type()
#    builder.create_input()
#    builder.create_button()
#    return builder.form()

def main():
   inquiryType = InquiryType()
   inquiryInput = InquiryInput()
   inquiryButton = InquiryButton()

   inquiryForm = Form(inquiryType, inquiryInput, inquiryButton)
   print "Form type",inquiryForm.getType()
   print "Form input",inquiryForm.getInput()
   print "Form button",inquiryForm.getButton()

   ### Mandatory checklist no 1 ###
   #entryType = EntryType()
   #entryInput = EntryInput()
   #entryButton = EntryButton()

   #entryForm = Form(entryType, entryInput, entryButton)
   #print "Form type",entryForm.getType() #will print "entry"
   #print "Form input",entryForm.getInput() #will print "data"
   #print "Form button",entryForm.getButton() #will print "save"

   ### Mandatory checklist no 2 ###
   #inquiryForm = create_form(InquiryFormFactory())
   #print "Form type",inquiryForm.getType()
   #print "Form input",inquiryForm.getInput()
   #print "Form button",inquiryForm.getButton()

   ### Mandatory checklist no 3 ###
   #inquiryForm = create_form(InquiryFormBuilder())
   #print "Form type",inquiryForm.getType()
   #print "Form input",inquiryForm.getInput()
   #print "Form button",inquiryForm.getButton()

main()
