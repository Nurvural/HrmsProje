import React from 'react'
import { Button, Checkbox, Icon, Table } from 'semantic-ui-react'
export default function JobAdvert() {
  return (
    
    <Table celled compact definition>
    <Table.Header fullWidth>
      <Table.Row>
        <Table.HeaderCell />
        <Table.HeaderCell>İLAN BAŞLIĞI</Table.HeaderCell>
        <Table.HeaderCell>İLAN AÇIKLAMASI</Table.HeaderCell>
        <Table.HeaderCell>ŞİRKET ADI</Table.HeaderCell>
        <Table.HeaderCell>POZİSYON </Table.HeaderCell>
        <Table.HeaderCell>AÇIK POZİSYON</Table.HeaderCell>
        <Table.HeaderCell>İLAN TARİHİ</Table.HeaderCell>
        <Table.HeaderCell>İLN BİTİŞ TARİHİ</Table.HeaderCell>
      </Table.Row>
    </Table.Header>

    <Table.Body>
      <Table.Row>
        <Table.Cell collapsing>
          <Checkbox slider />
        </Table.Cell>
        <Table.Cell>Java Developer Aranıyor</Table.Cell>
        <Table.Cell>açıklama</Table.Cell>
        <Table.Cell>Trendyol</Table.Cell>
        <Table.Cell>Java Developer </Table.Cell>
        <Table.Cell>2</Table.Cell>
        <Table.Cell>2021</Table.Cell>
        <Table.Cell>2021 </Table.Cell>
      </Table.Row>
   
    </Table.Body>

    <Table.Footer fullWidth>
      <Table.Row>
        <Table.HeaderCell />
        <Table.HeaderCell colSpan='8'>
          <Button
            floated='right'
            icon
            labelPosition='left'
            primary
            size='small'
          >
            <Icon name='ilan' /> İş İlanı Ekle
          </Button>
         
        </Table.HeaderCell>
      </Table.Row>
    </Table.Footer>
  </Table>
    
  )
}
